package sec02.exam01_nestedclass_instance_member_class;

public class AExample {

	public static void main(String[] args) {
		//A��ü�� �����ϰ� B��ü�� �����ؾ� �Ѵ�.
		A a = new A();
		A.B b = a.new B();

		b.field1 = 3;
		b.method1();
	}

}
