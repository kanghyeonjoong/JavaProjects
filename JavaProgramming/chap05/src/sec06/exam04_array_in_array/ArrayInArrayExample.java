package sec06.exam04_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		/*
		 * 힙 메모리에는 세 개의 배열 객체가 생성된다. 배열 변수 mathScores는 길이 2인 배열 객체A를 참조한다. 배열 A의
		 * mathScores[0]은 다시 길이가 3인 배열 B를 참조한다. 그리고 mathScores[1] 역시 길이가 3인 배열 C를 참조한다.
		 * mathScores[0]과 mathScores[1]은 모두 배열을 참조하는 변수 역할을 한다. mathScores.length //2(배열
		 * A의 길이) mathScores[0].length//3(배열 B의 길이) mathScores[1].length//3(배열 C의 길이)
		 * 자바는 일차원 배열이 서로 연결되는 구조로 다차원 배열을 구현하기 때문에 계단식 구조를 가진다.
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

		//향상된 for문
		for (int i = 0; i < javaScores.length; i++) {
			int j = 0;
			for (int item : javaScores[i]) {
				System.out.println("javaScores[" + i + "][" + j + "]=" + item);
				j++;
			}
		}
	}

}
