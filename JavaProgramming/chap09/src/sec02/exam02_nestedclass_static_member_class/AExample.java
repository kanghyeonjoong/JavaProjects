package sec02.exam02_nestedclass_static_member_class;

public class AExample {

	public static void main(String[] args) {
		//�ν��Ͻ� �ʵ�� �޼ҵ带 ����Ϸ��� ��ü�� �����ؾ� �Ѵ�.
		A.C c=new A.C();
		c.field1=3;
		c.method1();
		
		A.C.field2=3;
		A.C.method2();
	}

}
