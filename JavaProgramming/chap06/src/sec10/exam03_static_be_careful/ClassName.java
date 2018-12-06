package sec10.exam03_static_be_careful;

public class ClassName {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {
	}
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {	
	}

	//정적 블록
	static {
		//인스턴스 필드와 인스턴스 메소드를 사용할 수 없다. 또한 객체 자신의 참조인 this 키워드도 사용할 수 없다.
	/*	field1=10;
		method1();*/
		
		field2=10;
		method2();
	}
	
	static void method3() {
		/*this.field1=10;
		this.method1();*/
		
		//정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고 참조 변수로 접근해야 한다.
		ClassName obj=new ClassName();
		obj.field1=10;
		obj.method1();
		
		field2=10;
		method2();
	}
}
