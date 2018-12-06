package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		/*
		 * ArrayList를 생성하고 런타임 시에 필요에 의해 객체들을 추가하는 것이 일반적이지만,
		 * 고정된 객체들로 구성된 List를 생성할 때도 있다.
		 */
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");

		for (String name : list) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}

}
