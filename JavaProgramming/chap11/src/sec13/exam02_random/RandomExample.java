package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		/*
		 * java.util.Random Ŭ������ ������ ��� �پ��� �޼ҵ带 �����Ѵ�.
		 * java.lang.Math.random()�޼ҵ�� 0.0���� 1.0������ double������ ��� ���� ����Ѵٸ�,
		 * Random Ŭ������ boolean, int, long, float, double ������ ���� �� �ִ�.
		 * Random Ŭ������ ���ڰ�(seed)�� ������ �� �ִ�. ���ڰ��� ������ ����� �˰��� ���Ǵ� ������ ���ڰ��� ������
		 * ���� ������ ��´�.
		 */

		//���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���� ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷ ��ȣ : ");
		for (int i = 0; i < winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		//��÷����
		Arrays.sort(selectNumber);//���ϱ� ���� ���Ľ�Ŵ
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ���� : ");
		if (result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
