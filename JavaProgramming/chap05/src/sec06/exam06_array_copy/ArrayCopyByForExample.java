package sec06.exam06_array_copy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// For������ �迭 ����
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] +( (i == newIntArray.length-1) ? "" : ", "));
		}

	}

}
