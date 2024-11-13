package pkg02_generic;

/**
 * 제네릭 타입 T : Container 인스턴스 생성 시 전달뇌는 타입.
 * (관례상 대문자 1글자 T(Type), E(Element), K(key), V(Value) 이름생성)
 * @param <T> 오직 Reference Type 만 전달 할 수 있다.
 */
public class Container<T> {

  // field
  private T item;
  
  // getter & setter
  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  



}
