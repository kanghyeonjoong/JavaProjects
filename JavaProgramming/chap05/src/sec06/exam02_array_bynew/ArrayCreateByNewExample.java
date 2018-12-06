package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		/*
		 * new연산자로 배열 객체 생성 new 연산자로 배열을 처음 생성한 경우, 배열은 자동적으로 기본값으로 초기화된다.
		 */
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println();

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println();

		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();

		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println();

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
