package sec16.exam01_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException{
		/*
		 * LocalDate는 로컬 날짜 클래스로 날짜 정보만 저장할 수 있다. LocalDate 객체는 두 가지의 정적 메소드로 얻을 수 있는데
		 * now()는 컴퓨터의 현재 날짜 정보를 저장한 LocalDate 객체를 리턴하고 of()는 매개값으로 주어진 날짜 정보를 저장한 LocalDate객체를 리턴한다.
		 */
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜: " + currDate.toString());

		LocalDate targetDate = LocalDate.of(2014, 5, 10);
		System.out.println("목표 날짜: " + targetDate + "\n");

		/* LocalTime은 로컬 시간 클래스로 시간 정보만을 저장할 수 있다. */
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간: " + currTime.toString());
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간: " + targetTime + "\n");

		/* LocalDateTime은 LocalDate와 LocalTime을 결합한 클래스라고 보면 되는데, 날짜와 시간 정보를 모두 저장할 수 있다. */
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간: " + targetDateTime + "\n");

		/*
		 * ZonedDateTime은 ISO-8601달력 시스템에서 정의하고 있는 타임존의 날짜와 시간을 저장하는 클래스이다.
		 * 저장형태는 타임존에 대한 정보(+-존오프셋[존아이디]) 추가적으로 붙는다.
		 * 존오프셋(ZoneOffSet)은 협정시(UTC:Universal Time Coordinated)와 차이 나는 시간(시차)를 말한다.
		 */
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 시계시: " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간존: " + seoulDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존: " + newyorkDateTime + "\n");
		
		/* Instant클래스는 특정 시점의 타임스탬프로 사용된다. */
		Instant instant1=Instant.now();
		Thread.sleep(10);
		Instant instant2=Instant.now();
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		}else if (instant1.isAfter(instant2)){
			System.out.println("instant1이 늦습니다.");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		System.out.println("차이(nanos): "+instant1.until(instant2, ChronoUnit.NANOS));
	}

}
