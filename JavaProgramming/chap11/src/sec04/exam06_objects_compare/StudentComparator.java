package sec04.exam06_objects_compare;

import java.util.Comparator;

//java.util.Comparator<T>�� ���׸� �������̽� Ÿ������ �� ��ü�� ���ϴ� compare(T a, T b)�޼ҵ尡 ���� �Ǿ� �ִ�.
//Comparator<T>�� �����ϴ� ����Ŭ������ �����.
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
