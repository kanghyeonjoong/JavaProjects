package sec02.exam01_nestedclass_instance_member_class;

public class AExample {

	public static void main(String[] args) {
		//A객체를 생성하고 B객체를 생성해야 한다.
		A a = new A();
		A.B b = a.new B();

		b.field1 = 3;
		b.method1();
	}

}
