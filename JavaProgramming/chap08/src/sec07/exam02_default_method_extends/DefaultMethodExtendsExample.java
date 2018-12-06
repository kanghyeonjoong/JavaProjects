package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	// ����Ʈ �޼ҵ尡 �ִ� �������̽� ��ӽ� ����Ʈ �޼ҵ带 Ȱ���ϴ� ���
	// 1. ����Ʈ �޼ҵ带 �ܼ��� ��ӹ޴´�.
	// 2. ����Ʈ �޼ҵ带 ������(Override)�ؼ� ���� ������ �����Ѵ�.
	// 3. ����Ʈ �޼ҵ带 �߻� �޼ҵ�� �缱���Ѵ�.
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ChildInterface1 ���� ��ü-method1() ����");
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 ���� ��ü-method3() ����");
			}
		};

		ci1.method1();
		ci1.method2();
		ci1.method3();

		System.out.println();

		ChildInterface2 ci2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 ���� ��ü-method1() ����");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 ���� ��ü-method3() ����");

			}
		};

		ci2.method1();
		ci2.method2();
		ci2.method3();

		System.out.println();

		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface3 ���� ��ü-method1() ����");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface3 ���� ��ü-method3() ����");

			}

			@Override
			public void method2() {
				System.out.println("ChildInterface3 ���� ��ü-method2() ����");

			}
		};

		ci3.method1();
		ci3.method2();
		ci3.method3();
	}
}
