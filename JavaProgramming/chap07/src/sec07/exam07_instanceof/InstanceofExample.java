package sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent) {
		//객체타입확인(instanceof)
		if (parent instanceof Child) {
			//강제 타입 변환(Casting)은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능하다.
			//부모 타입의 변수가 부모 객체를 참조할 경우 자식 타입으로 변환할 수 없다.
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;// java.lang.ClassCastException이 발생할 가능성이 있음
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
