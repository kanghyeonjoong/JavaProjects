package sec02.exam01_nestedclass_instance_member_class;

public class A {
	// �ʵ�
	// �ν��Ͻ� ��� Ŭ������ �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �����ϰ� ���� �ʵ�� ���� �޼ҵ�� ������ �� ����.
	class B {
		// �ʵ�
		int field1;
//		static int field2;

		// ������
		B() {
		}

		// �޼ҵ�
		void method1() {
			System.out.println(field1);
			System.out.println("AŬ�������� BŬ����-method1()");
		}

//		static void method2() {
//		}
	}
}
