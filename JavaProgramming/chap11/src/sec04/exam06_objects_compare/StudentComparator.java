package sec04.exam06_objects_compare;

import java.util.Comparator;

//java.util.Comparator<T>는 제네릭 인터페이스 타입으로 두 객체를 비교하는 compare(T a, T b)메소드가 정의 되어 있다.
//Comparator<T>를 구현하는 구현클래스를 만든다.
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		/*
		 * if (o1.sno < o2.sno) return -1; else if (o1.sno == o2.sno) return 0; else
		 * return 1;
		 */

		return o1.getStudentNo().compareTo(o2.getStudentNo());
	}

}
