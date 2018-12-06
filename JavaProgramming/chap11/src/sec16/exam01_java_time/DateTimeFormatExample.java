package sec16.exam01_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		//날짜와 시간을 포맷된 문자열로 변환시키는 Format()메소드
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);

	}

}
