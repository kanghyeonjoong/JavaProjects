package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		/*
		 * java.util.Date 클래스
		 * Date()클래스는 컴퓨터의 현재 날짜을 읽어 Date객체를 만든다.
		 */
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		/* java.text.SimpleDateFormat클래스를 이용해 특정 문자열 포맷을 사용한다. */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
