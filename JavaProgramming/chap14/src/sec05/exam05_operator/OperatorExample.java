package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	/*
	 * Operator 함수적 인터페이스 : Function과 동일하게 매개변수와 리턴값이 있는 applyXXX()메소드를 가진다.
	 * applyXXX()메소드들은 매개값을 리턴값으로 매핑(타입 변환)하는 역할보다는 
	 * 매개값을 이용해서 연산을 수행한 후 동일한 타입으로 리턴값을 제공하는 역할을 한다.
	 * 매개값->Operator->리턴값
	 */
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);//람다식{} 실행
		}

		return result;
	}

	public static void main(String[] args) {
		//쵀대값 얻기
		int max = maxOrMin((a, b) -> {//람다식(큰값 리턴)
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

		//최소값
		int min = maxOrMin((a, b) -> {//람다식(작은값 리턴)
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);
	}

}
