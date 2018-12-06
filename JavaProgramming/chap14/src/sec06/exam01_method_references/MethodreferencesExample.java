package sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodreferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;//�� ���� int����

		/*
		 * �޼ҵ� ����: �޼ҵ带 �����ؼ� �Ű������� ���� �� ���� Ÿ���� �˾Ƴ���, ���ٽĿ��� ���ʿ��� �Ű� ������ �����ϴ� ���� �����̴�.
		 * 1. ���� �޼ҵ� ���� : Ŭ����::�޼ҵ�
		 * 2.�ν��Ͻ� �޼ҵ� ���� : ��������::�޼ҵ�
		 */
		//���� �޼ҵ� ����
		operator = (x, y) -> Calculator.staticMethod(x, y);
		int result1 = operator.applyAsInt(1, 2);
		System.out.println("���1: " + result1);

		operator = Calculator::staticMethod;
		int result2 = operator.applyAsInt(3, 4);
		System.out.println("���2: " + result2);

		//�ν��Ͻ��޼ҵ� ����
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		int result3 = operator.applyAsInt(5, 6);
		System.out.println("���3: " + result3);

		operator = obj::instanceMethod;
		int result4 = operator.applyAsInt(7, 8);
		System.out.println("���4: " + result4);
	}

}
