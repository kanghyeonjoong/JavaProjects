package sec16.exam01_java_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재: " + now);

		LocalDateTime targetDateTime = null;

		targetDateTime = now.withYear(2024).withMonth(10).withDayOfMonth(5).withHour(13).withMinute(30).withSecond(20);
		System.out.println("직접 변경: " + targetDateTime);

		/*
		 * with(TemportalAdjuster adjuster),메소드는 현재 날짜를 기준으로 해의 첫 번째 일 또는 마지막 일, 달의 첫 번째 일 또는 마지막 일,
		 * 달의 첫 번째 일 또는 마지막 일, 달의 첫 번째 요일, 지난 요일 및 돌아 오는 요일 등 상대적인 날짜를 리턴한다.
		 */
		//년도 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일: " + targetDateTime);

		//월 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일: " + targetDateTime);

		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일: " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일: " + targetDateTime);
	}

}
