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
		 * LocalDate�� ���� ��¥ Ŭ������ ��¥ ������ ������ �� �ִ�. LocalDate ��ü�� �� ������ ���� �޼ҵ�� ���� �� �ִµ�
		 * now()�� ��ǻ���� ���� ��¥ ������ ������ LocalDate ��ü�� �����ϰ� of()�� �Ű������� �־��� ��¥ ������ ������ LocalDate��ü�� �����Ѵ�.
		 */
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥: " + currDate.toString());

		LocalDate targetDate = LocalDate.of(2014, 5, 10);
		System.out.println("��ǥ ��¥: " + targetDate + "\n");

		/* LocalTime�� ���� �ð� Ŭ������ �ð� �������� ������ �� �ִ�. */
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð�: " + currTime.toString());
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("��ǥ �ð�: " + targetTime + "\n");

		/* LocalDateTime�� LocalDate�� LocalTime�� ������ Ŭ������� ���� �Ǵµ�, ��¥�� �ð� ������ ��� ������ �� �ִ�. */
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð�: " + currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");

		/*
		 * ZonedDateTime�� ISO-8601�޷� �ý��ۿ��� �����ϰ� �ִ� Ÿ������ ��¥�� �ð��� �����ϴ� Ŭ�����̴�.
		 * �������´� Ÿ������ ���� ����(+-��������[�����̵�]) �߰������� �ٴ´�.
		 * ��������(ZoneOffSet)�� ������(UTC:Universal Time Coordinated)�� ���� ���� �ð�(����)�� ���Ѵ�.
		 */
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �ð��: " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� �ð���: " + seoulDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �ð���: " + newyorkDateTime + "\n");
		
		/* InstantŬ������ Ư�� ������ Ÿ�ӽ������� ���ȴ�. */
		Instant instant1=Instant.now();
		Thread.sleep(10);
		Instant instant2=Instant.now();
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1�� �����ϴ�.");
		}else if (instant1.isAfter(instant2)){
			System.out.println("instant1�� �ʽ��ϴ�.");
		}else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(nanos): "+instant1.until(instant2, ChronoUnit.NANOS));
	}

}
