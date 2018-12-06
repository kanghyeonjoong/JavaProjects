package sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	/*
	 * Function 함수적 인터페이스 : 매개값과 리턴값이 있는 applyXXX() 추상 메소드를 가지고 있다.
	 * applyXXX()메소드들은 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다.
	 * 매개값->Function->리턴값
	 */
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");//람다식 실행
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());

		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
	}

}
