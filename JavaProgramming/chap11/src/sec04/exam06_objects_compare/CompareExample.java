package sec04.exam06_objects_compare;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student("1", "ȫ�浿");
		Student s2 = new Student("1", "ȫ�浿");
		Student s3 = new Student("2", "��μ�");

		//��ü��(compare(T a, T b, Comparator<T> c))�� �� ��ü�� ����(Comparator)�� ���ؼ�
		//int (a < b�̸� ����,  a = b�̸� 0, a > b�̸� ���)���� �����Ѵ�.
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);

		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}

}
