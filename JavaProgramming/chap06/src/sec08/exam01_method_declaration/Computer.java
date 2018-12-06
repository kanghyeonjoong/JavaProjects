package sec08.exam01_method_declaration;

public class Computer {
	// 메소드
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}

	//매개 변수를 "..."를 사용해서 선언하게 되면, 메소드 호출 시 넘겨준 값의 수에 따라  자동으로
	//배열이 생성되고 매개값으로 사용된다.
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;
	}
}
