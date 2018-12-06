package sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println("현재시: " + now);

		//현재 날짜와 시간을 얻은 후 1년을 더하고, 2달을 빼고, 3일을 더하고, 4시간을 더하고, 5분을 빼고, 6초를 더한 날짜와 시간을 얻는다.
		LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산 후: " + targetDateTime);
	}

}
