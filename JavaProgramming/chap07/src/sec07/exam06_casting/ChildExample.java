package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자동타입변환(Promotion)
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

	/*	parent.field2 = "data2";
		parent.method3();*/

		//자식 타입이 부모 타입으로 자동 변환하면, 부모 타입에 선언된 필드와 메소드만 사용 가능하다.
		//만약 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로
		//변환한 다음 자식 타입의 필드와 메소드를 사용하면 된다.
		Child child = (Child) parent;//강제타입변환(Casting)
		child.field2 = "data2";
		child.method3();
	}

}
