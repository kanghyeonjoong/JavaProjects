package sec13.exam02_field_method_access.package1;

public class A {
	// �ʵ�
	public int field1;// public ���� ����
	int field2;// default ���� ����
	private int field3;// private ���� ����

	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	// �޼ҵ�
	public void method1() {
		System.out.println(this.field1);
		System.out.println(this.field2);
		System.out.println(this.field3);
	}// public ���� ����

	void method2() {
	}// default ���� ����

	private void method3() {
	}// private ���� ����
}
