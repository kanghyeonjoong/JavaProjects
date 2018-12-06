package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		/*
		 * 날짜와 시간 클래스는 문자열을 파싱(parsing)해서 날짜와 시간을 생성하는 메소드와
		 * 날짜와 시간을 포맷팅(Formatting)된 문자열로 변환하는 메소드를 제공한다.
		 */

		DateTimeFormatter formatter;
		LocalDate localDate;

		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);

		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);

		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);

		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
	}

}
