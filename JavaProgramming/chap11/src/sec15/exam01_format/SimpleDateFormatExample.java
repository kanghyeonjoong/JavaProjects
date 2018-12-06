package sec15.exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		/*
		 * java.util.Date클래스의 toString()메소드는 영문으로된 날짜를 리턴하는데 만약 특정 문자열 포맷으로 얻고 싶다면
		 * java.text.SimpleDateFormat클래스를 이용하면 된다.
		 */
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf=new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}

}
