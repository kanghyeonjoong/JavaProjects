package sec02.exam03_nestedclass_local_class;

public class A {
	//���� Ŭ������ �޼ҵ� ���ο����� ���ǹǷ� ���� ������(public, private) �� static�� ���� �� ����.
	//���� Ŭ���� ���ο����� �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �����ϰ� ���� �ʵ�� �޼ҵ�� ������ �� ����.
	void method() {
		// ���� Ŭ����
		class D {
			D() {
			}

			int field1;
			//static int field2;

			void method1() {
			}

//			static void method2() {
//			}
		}
		
		D d=new D();
		d.field1=3;
		d.method1();
	}
}
