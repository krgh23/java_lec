package pkg10_interface.A_overview;

/*
 * 클래스 상속    vs    인터페이스 구현
 *    
 *    클래스            인터페이스
 * 1. 상속한다.         구현한다.
 * 2. extends           implements(임플먼츠)
 * 3. 자식 클래스       구현 클래스
 */

public class Rectangle implements Shape{
  
  private double width;
  private double height;
  
  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return 2 * (height + width);
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return height * width;
  }




}
