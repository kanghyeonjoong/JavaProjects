package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = { { 1, 2 }, { 3, 4 } };
		/*
		 * Arrays.equals()�� Arrays.deepEquals()�� �迭�� �׸��� ���Ѵ�.
		 * Arrays.equals()�� 1�� �׸��� ���� ���ϰ�, Arrays.deepEquals()�� ��ø�� �迭�� �׸���� ���Ѵ�.
		 */
		System.out.println("[���� ���� �� ��]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned1));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned1));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned1));

		System.out.println("\n[���� ���� �� ��]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned2));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, cloned2));
		System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(original, cloned2));
	}

}