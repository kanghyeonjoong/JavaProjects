package sec06.exam02_argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;//��ü T�� U�� int�� ����(Ÿ�� ��ȯ)

		/*
		 * �Ű������� �޼ҵ� ����
		 * �޼ҵ�� ���ٽ� �ܺ��� Ŭ���� ����� ���� �ְ�, ���ٽĿ��� �����ϴ� �Ű� ������ ����� ���� �ִ�.
		 * (a, b)->{ a.instanceMethod(b); }
		 * ���ٽĿ��� �����ϴ� a �Ű� ������ �޼ҵ带 ȣ���ؼ� b �Ű� ������ �Ű������� ����ϴ� ��쵵 �ִ�.
		 * �̰��� �޼ҵ� ������ ǥ���ϸ� a�� Ŭ���� �̸� �ڿ� ::�� ���̰� �޼ҵ� �̸��� ����Ѵ�. �ۼ� ����� ���� �޼ҵ� ������ ����������,
		 * a�� �ν��Ͻ� �޼ҵ尡 �����ǹǷ� ���� �ٸ� �ڵ尡 ����ȴ�.
		 * =>Ŭ����::�ν��Ͻ� �޼ҵ�
		 */

		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));

		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));

	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("���������� ���� �ɴϴ�.");
		} else if (order == 0) {
			System.out.println("������ �����Դϴ�.");
		} else {
			System.out.println("���������� ���߿� �ɴϴ�.");
		}
	}
}
