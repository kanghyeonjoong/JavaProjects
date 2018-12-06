package sec04.exam01_objects_compare;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		//객체비교(compare(T a, T b, Comparator<T> c))는 두 객체를 비교자(Comparator)로 비교해서
		//int 값을 리턴한다.
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);

		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}

}
