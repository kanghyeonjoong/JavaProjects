package sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", "����", 90), new Student("�����", "����", 90),
			new Student("���ڹ�", "����", 95), new Student("���ϳ�", "����", 92));

	/*
	 * Predicate �Լ��� �������̽� : �Ű� ������ boolean ���ϰ��� �ִ� testXXX()�޼ҵ带 ������.
	 * testXXX()�޼ҵ���� �Ű����� �����ؼ� true �Ǵ� false�� �����ϴ� ������ �Ѵ�.
	 * �Ű���->Predicate->boolean
	 */
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {//���ٽ��� ����
				count++;
				sum += student.getScore();
			}
		}

		return (double) sum / count;
	}

	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + femaleAvg);
	}

}
