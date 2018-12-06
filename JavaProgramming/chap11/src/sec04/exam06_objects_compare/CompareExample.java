package sec04.exam06_objects_compare;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student("1", "홍길동");
		Student s2 = new Student("1", "홍길동");
		Student s3 = new Student("2", "김민수");

		//객체비교(compare(T a, T b, Comparator<T> c))는 두 객체를 비교자(Comparator)로 비교해서
		//int (a < b이면 음수,  a = b이면 0, a > b이면 양수)값을 리턴한다.
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);

		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}

}
