package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		/*
		 * 값 목록으로 배열 생성
		 * 타입[] 변수={값0, 값1, 값...}
		 * {}는 주어진 값들을 항목으로 가지는 배열 객체를 힙에 생성하고, 배열 객체의 번지를 리턴한다.
		 */
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
