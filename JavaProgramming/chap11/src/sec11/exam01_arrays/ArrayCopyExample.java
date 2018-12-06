package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		System.out.println("arr1 : " + Arrays.toString(arr1));

		/*
		 * java.util.Arrays Ŭ������ �迭 ���� ���(�׸� ����, �׸� �˻�, �׸� ��, �迭 ����)�� ������.
		 * java.util.Arrays Ŭ������ ��� �޼ҵ�� �����̹Ƿ� ArraysŬ������ �ٷ� ����� �����ϴ�.
		 */
		//���1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();

		//���2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("arr3 : " + Arrays.toString(arr3));
		System.out.println();
		
		//���3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[ " + i + "]=" + arr4[i]);
		}
		System.out.println();

		//String �迭 ����
		String[] strArray1 = { "Java", "C#", "C++", "COBOL" };

		String[] strArray2 = Arrays.copyOf(strArray1, strArray1.length);

		strArray2[0] = "FORTRAN";
		for (int i = 0; i < strArray1.length; i++) {
			System.out.println("strArray1[" + i + "] == strArray2[" + i + "] : " + (strArray1[i] == strArray2[i]));
		}
		System.out.println();
		System.out.println("strArray1->" + Arrays.toString(strArray1));
		System.out.println("strArray2->" + Arrays.toString(strArray2));
	}

}
