package sec04.exam01_generic_method;

public class Util {
	/*
	 * 제네릭 메소드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드를 말한다.
	 * 제네릭 메소드 선언 방법은 리턴 타입 앞에 <>기호를 추가하고 타입 파라미터를 기술한 다음,
	 * 리턴 타입과 매개 타입으로 타입 파라미터를 사용하면 된다.
	 * public <타입 파라미터,...> 리턴타입 메소드명(매개변수,...) {...}
	 */
	public static <T> Box<T> boxing(T t){
		Box<T>box=new Box<>();
		box.set(t);
		
		return box;
	}
}
