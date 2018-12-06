package sec06.exam04_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		/*
		 * �� �޸𸮿��� �� ���� �迭 ��ü�� �����ȴ�. �迭 ���� mathScores�� ���� 2�� �迭 ��üA�� �����Ѵ�. �迭 A��
		 * mathScores[0]�� �ٽ� ���̰� 3�� �迭 B�� �����Ѵ�. �׸��� mathScores[1] ���� ���̰� 3�� �迭 C�� �����Ѵ�.
		 * mathScores[0]�� mathScores[1]�� ��� �迭�� �����ϴ� ���� ������ �Ѵ�. mathScores.length //2(�迭
		 * A�� ����) mathScores[0].length//3(�迭 B�� ����) mathScores[1].length//3(�迭 C�� ����)
		 * �ڹٴ� ������ �迭�� ���� ����Ǵ� ������ ������ �迭�� �����ϱ� ������ ��ܽ� ������ ������.
		 */
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]=" + englishScores[i][j]);
			}
		}
		System.out.println();

		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "]=" + javaScores[i][j]);
			}
		}
		System.out.println();

		//���� for��
		for (int i = 0; i < javaScores.length; i++) {
			int j = 0;
			for (int item : javaScores[i]) {
				System.out.println("javaScores[" + i + "][" + j + "]=" + item);
				j++;
			}
		}
	}

}
