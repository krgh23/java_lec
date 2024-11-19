package pkg05_openAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OpenAPIEx {
 
  // 응답 결과 받기
  
  public static void a() throws Exception {
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append("qzRprpmLvEwKaofjeBYIpFAnTYW14dwLfXebw1%2BY9Wnal1h2obXMkStg78v8n4Aoh8up35Lym%2FVdUOFVb%2FplgA%3D%3D");
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    
    URL url = new URL(builder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
    System.out.println(responseBody.toString());
    
    in.close();
    conn.disconnect();
    
    
    /* XML -> JSONObject 변경하기*/
    // org.json.JSONObject obj = org.json.XML.toJSONObject(responseBody.toString());
    // System.out.println(obj);
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void b() throws Exception {
    
    // 응답 XML 파싱하기
    
    String serviceKey = "qzRprpmLvEwKaofjeBYIpFAnTYW14dwLfXebw1%2BY9Wnal1h2obXMkStg78v8n4Aoh8up35Lym%2FVdUOFVb%2FplgA%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(builder.toString());
        
    doc.getDocumentElement().normalize();
    System.out.println("Root tag : " + doc.getDocumentElement().getNodeName());  // 엘러먼츠, 노드,<response> //태그 XML 문서를 파싱할 때 가장 최상위 태그(root element)의 이름을 출력
    
    NodeList nodeList = doc.getElementsByTagName("item");  // <item> 태그 모두 가져오기
    System.out.println("노드 갯수 : " + nodeList.getLength());  // 700 (<item> 태그가 700개)
    
    for(int i = 0, length = nodeList.getLength(); i < length; i++) {
      
      Node node = nodeList.item(i);  // 각 <item> 태그
      System.out.println(((Element) node).getElementsByTagName("baseDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("baseTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("category").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstValue").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("nx").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("ny").item(0).getTextContent());
      System.out.println("----------");
      
    }
      
  }
  
  
  
  
  
  
  
  public static void c() throws Exception {
    
    /* JOSNObject 사용법 */
    /*
    JSONObject obj = new JSONObject("{\"name\": \"kim\", \"age\": 30}");
    System.out.println(obj.getString("name"));
    System.out.println(obj.getInt("age"));
    */
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append("qzRprpmLvEwKaofjeBYIpFAnTYW14dwLfXebw1%2BY9Wnal1h2obXMkStg78v8n4Aoh8up35Lym%2FVdUOFVb%2FplgA%3D%3D");
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    builder.append("&dataType=").append("JSON");  // JSON 으로 변경 -> 결과 {}으로 묶여있음 JOSNObject
    
    URL url = new URL(builder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
 
    System.out.println(responseBody.toString());
    
    in.close();
    conn.disconnect();
    
    JSONArray item = new JSONObject(responseBody.toString())
                          .getJSONObject("response")
                          .getJSONObject("body")
                          .getJSONObject("items")
                          .getJSONArray("item");
    // System.out.println(item.length());
    // System.out.println( item.getJSONObject(0).getString("category") );
    for(int i = 0, length = item.length(); i < length; i++) {
      System.out.println(item.getJSONObject(i).getString("baseDate"));
      System.out.println(item.getJSONObject(i).getString("baseTime"));
      System.out.println(item.getJSONObject(i).getString("category"));
      System.out.println(item.getJSONObject(i).getString("fcstDate"));
      System.out.println(item.getJSONObject(i).getString("fcstTime"));
      System.out.println(item.getJSONObject(i).getString("fcstValue"));
      System.out.println(item.getJSONObject(i).getInt("nx"));
      System.out.println(item.getJSONObject(i).getInt("ny"));
      System.out.println("-----------------------------------------------");
    }
  
  }


  
  
  
  public static void d() throws Exception {
    
    // 기상청 RSS (XML 받아서 Document 이용해서 파싱하기)
    
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(apiURL);
    
    doc.getDocumentElement().normalize();
    
    NodeList nodeList = doc.getElementsByTagName("data");  // 19개의 <data> 태그들
    
    for(int i = 0, length = nodeList.getLength(); i < length; i++) {
      
      Node node = nodeList.item(i);      // 각 <data> 태그
      Element element = (Element) node;  // getElementsByTagName() 메소드 사용을 위해서 Node -> Element 변경
      System.out.println("hour : " + element.getElementsByTagName("hour").item(0).getTextContent());
      System.out.println("temp : " + element.getElementsByTagName("temp").item(0).getTextContent());
      System.out.println("tmx : " + element.getElementsByTagName("tmx").item(0).getTextContent());
      System.out.println("tmn : " + element.getElementsByTagName("tmn").item(0).getTextContent());
      System.out.println("wfKor : " + element.getElementsByTagName("wfKor").item(0).getTextContent());
      System.out.println("----------");
      
    }
    
  }
  
  
  
  
  
  
  public static void e() throws Exception {
    
    // 기상청 RSS (XML 받아서 JSONObject 로 바뀐 뒤 파싱하기)
    
    String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168066000";
    
    URL url = new URL(apiURL);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
    in.close();
    conn.disconnect();
    
    /* XML -> JSONObject 변경하기*/
    // org.json.JSONObject obj = org.json.XML.toJSONObject(responseBody.toString());
    // System.out.println(obj);
    System.out.println(XML.toJSONObject(responseBody.toString()));
    
    /* XML -> JSONObject */
    JSONArray data = XML.toJSONObject(responseBody.toString())
      .getJSONObject("rss")
      .getJSONObject("channel")
      .getJSONObject("item")
      .getJSONObject("description")
      .getJSONObject("body")
      .getJSONArray("data");
    
      
    for(int i = 0, length = data.length(); i < length; i++) {
      JSONObject obj = data.getJSONObject(i);
      System.out.println("hour : " + obj.getInt("hour"));
      System.out.println("temp : " + obj.getInt("temp"));
      System.out.println("tmx : " + obj.getInt("tmx"));
      System.out.println("tmn : " + obj.getInt("tmn"));
      System.out.println("wfKor : " + obj.getString("wfKor"));
      System.out.println("---------------");
    }
    
  }

  /* 계층 구조 파악 방법
  {
    "rss":{
      "channel":{
        "item":{
          "author":"기상청",
          "link":"http://www.kma.go.kr/weather/forecast/timeseries.jsp?searchType=INTEREST&dongCode=1168066000",
          "guid":"http://www.kma.go.kr/weather/forecast/timeseries.jsp?searchType=INTEREST&dongCode=1168066000",
          "description":{
            "header":{
              "x":61,
              "tm":202411191400,
              "y":125,
              "ts":4
             },
            "body":{
              "data":[
                {"sky":3,"wdEn":"N","temp":8,"wfKor":"구름 많음","wd":0,"wfEn":"Mostly 
                ...
                }
              ]
            }
          }
        }
      }
    }
  }  
  */
  
  public static void main(String[] args) throws Exception {
    a();
    //b();
    //c();
    //d();
    //e();
  }
}
