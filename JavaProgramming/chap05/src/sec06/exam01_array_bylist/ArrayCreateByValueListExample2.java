package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		/*
		 * 배열 변수를 미리 선언한 후, 값 목록들이 나중에 결정되는 상황이라면 new연산자를 사용해서 값 목록을 지정해줘야 한다. new 연산자
		 * 바로 뒤에는 배열 변수 선언에서 사용한 "타입[]"을 붙여주고 중괄호{}에는 값들을 나열해준다.
		 */
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		return sum;
	}
}
