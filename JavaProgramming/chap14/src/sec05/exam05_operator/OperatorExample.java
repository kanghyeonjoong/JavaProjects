package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	/*
	 * Operator �Լ��� �������̽� : Function�� �����ϰ� �Ű������� ���ϰ��� �ִ� applyXXX()�޼ҵ带 ������.
	 * applyXXX()�޼ҵ���� �Ű����� ���ϰ����� ����(Ÿ�� ��ȯ)�ϴ� ���Һ��ٴ� 
	 * �Ű����� �̿��ؼ� ������ ������ �� ������ Ÿ������ ���ϰ��� �����ϴ� ������ �Ѵ�.
	 * �Ű���->Operator->���ϰ�
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);//���ٽ�{} ����
		}

		return result;
	}

	public static void main(String[] args) {
		//���밪 ���
		int max = maxOrMin((a, b) -> {//���ٽ�(ū�� ����)
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("�ִ밪: " + max);

		//�ּҰ�
		int min = maxOrMin((a, b) -> {//���ٽ�(������ ����)
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("�ּҰ�: " + min);
	}

}
