package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		/*
		 * java.util.Random 클래스는 난수를 얻는 다양한 메소드를 제공한다.
		 * java.lang.Math.random()메소드는 0.0에서 1.0사이의 double난수를 얻는 데만 사용한다면,
		 * Random 클래스는 boolean, int, long, float, double 난수를 얻을 수 있다.
		 * Random 클래스는 종자값(seed)을 설정할 수 있다. 종자값은 난수를 만드는 알고리즘에 사용되는 값으로 종자값이 같으면
		 * 같은 난수를 얻는다.
		 */

		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < winningNumber.length; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		//당첨여부
		Arrays.sort(selectNumber);//비교하기 전에 정렬시킴
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
