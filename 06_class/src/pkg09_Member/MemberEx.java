package pkg09_Member;

public class MemberEx {

  public static void main(String[] args) {
    
    // Member 타입의 인스턴스 m 생성
    Address address = new Address("12345", "서울시 강남구", "장연빌딩 5층");
    Contact contact = new Contact("010-0000-1234");
    Member m = new Member("tom", address, contact);
    
    m.info();
    
    
    
    /*
    Member m2 = new Member(
                      "alice"
                    , new Address(null, null, null)
                    , new Contact()
                );
    */
    
    
    
    
    
    
  }

}
