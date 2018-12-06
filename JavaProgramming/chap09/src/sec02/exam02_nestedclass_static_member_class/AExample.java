package sec02.exam02_nestedclass_static_member_class;

public class AExample {

	public static void main(String[] args) {
		//인스턴스 필드와 메소드를 사용하려면 객체를 생성해야 한다.
		A.C c=new A.C();
		c.field1=3;
		c.method1();
		
		A.C.field2=3;
		A.C.method2();
	}

}
