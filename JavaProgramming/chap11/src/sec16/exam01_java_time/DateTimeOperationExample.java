package sec16.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.println("�����: " + now);

		//���� ��¥�� �ð��� ���� �� 1���� ���ϰ�, 2���� ����, 3���� ���ϰ�, 4�ð��� ���ϰ�, 5���� ����, 6�ʸ� ���� ��¥�� �ð��� ��´�.
		LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5)
				.plusSeconds(6);
		System.out.println("���� ��: " + targetDateTime);
	}

}
