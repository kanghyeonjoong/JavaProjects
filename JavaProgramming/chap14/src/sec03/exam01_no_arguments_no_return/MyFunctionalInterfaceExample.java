package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		/*
		 * ���ٽ��� �͸� �Լ�(anonymous function)�� �����ϱ� ���� ���̴�.
		 * ���ٽ��� ���´� �Ű� ������ ���� �ڵ� ���������, ��Ÿ�ӽÿ��� �͸� ���� ��ü�� �����Ѵ�.
		 * =>���ٽ�->�Ű� ������ ���� �ڵ���->�͸� ���� ��ü
		 * =>(Ÿ�� �Ű� ����,...)->{���๮;...}
		 * 
		 * MyFunctionalInterface�� Ÿ�� Ÿ������ ���� ���ٽ����� ���ٽĿ��� �Ű� ������ ���� ������ method()�� �Ű� ������ ������ �ʱ� �����̴�.
		 */
		MyFunctionalInteface fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		/*
		 * ���ٽ��� ���Ե� �������̽��� ���� ������ method()�� ȣ���� �� �ִ�.
		 * method()ȣ���� ���ٽ��� �߰�ȣ { }�� �����Ų��.
		 */
		fi.method();

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();

		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
