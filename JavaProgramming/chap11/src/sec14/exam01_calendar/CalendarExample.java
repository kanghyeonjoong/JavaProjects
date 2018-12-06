package sec14.exam01_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

public class CalendarExample {

	public static void main(String[] args) {
		/*
		 * java.util.Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� new �����ڸ� �̿��� �ν��Ͻ��� ������ �� ����.
		 * �� ������ ��¥�� �ð��� ����ϴ� ����� ������ ��ȭ, ���� ���� �ٸ��� �����̴�.
		 * Ư���� ������ ����ϴ� ��찡 �ƴ϶�� ���� ���� Ŭ������ ���� �ʿ�� ����, CalendarŬ������
		 * ���� �޼ҵ��� getInstance()�޼ҵ带 �̿��ϸ� ���� �ü���� �����Ǿ� �ִ� �ð���(TimeZone)��
		 * �������� �� Calendar ���� ��ü�� ���� �� �ִ�.
		 */
		Calendar now = Calendar.getInstance();//CalendarŬ������ ���� Ŭ������ ����

		  TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		  now = Calendar.getInstance(timeZone);
		 
		//Calendar ��ü�� ����ٸ� get()�޼ҵ带 �̿��ؼ� ��¥�Ƥ� �ð� ������ ���� �� �ִ�.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� \n");
 
	}

}