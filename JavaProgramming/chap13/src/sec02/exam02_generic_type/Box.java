package sec02.exam02_generic_type;

/*
 * 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
 * 제네릭 타입은 클래스 또는 인터페이스 이름 뒤에 "<>"부호가 붙고, 사이에 타입 파라미터가 위치한다.
 */
public class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}
