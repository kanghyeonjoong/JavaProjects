package sec10.exam03_static_be_careful;

public class ClassName {
	//�ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1() {
	}
	
	//���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {	
	}

	//���� ���
	static {
		//�ν��Ͻ� �ʵ�� �ν��Ͻ� �޼ҵ带 ����� �� ����. ���� ��ü �ڽ��� ������ this Ű���嵵 ����� �� ����.
	/*	field1=10;
		method1();*/
		
		field2=10;
		method2();
	}
	
	static void method3() {
		/*this.field1=10;
		this.method1();*/
		
		//���� �޼ҵ�� ���� ��Ͽ��� �ν��Ͻ� ����� ����ϰ� �ʹٸ� ��ü�� ���� �����ϰ� ���� ������ �����ؾ� �Ѵ�.
		ClassName obj=new ClassName();
		obj.field1=10;
		obj.method1();
		
		field2=10;
		method2();
	}
}
