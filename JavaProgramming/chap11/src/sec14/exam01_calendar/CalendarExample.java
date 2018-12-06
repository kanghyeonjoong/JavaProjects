package sec14.exam01_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

public class CalendarExample {

	public static void main(String[] args) {
		/*
		 * java.util.Calendar 클래스는 추상 클래스이므로 new 연산자를 이용해 인스턴스를 생성할 수 없다.
		 * 그 이유는 날짜와 시간을 계산하는 방법이 지역과 문화, 나라에 따라 다르기 때문이다.
		 * 특별한 역법을 사용하는 경우가 아니라면 직접 하위 클래스를 만들 필요는 없고, Calendar클래스의
		 * 정적 메소드인 getInstance()메소드를 이용하면 현재 운영체제에 설정되어 있는 시간대(TimeZone)를
		 * 기준으로 한 Calendar 하위 객체를 얻을 수 있다.
		 */
		Calendar now = Calendar.getInstance();//Calendar클래스의 하위 클래스를 생성

		  TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		  now = Calendar.getInstance(timeZone);
		 
		//Calendar 객체를 얻었다면 get()메소드를 이용해서 날짜아ㅘ 시간 정보를 읽을 수 있다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 \n");
 
	}

}
