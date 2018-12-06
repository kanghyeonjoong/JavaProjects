package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	/*
	 * ���׸� Ÿ��(Ÿ�� �Ķ���͸� ������ Ŭ������ �������̽�)�� �Ű����̳� ���� Ÿ������ ����� �� ��ü���� Ÿ�� ��ſ�
	 * ���ϵ� ī��(?)�� �� ���� ���·� ����� �� �ִ�.
	 * 1. ���׸�Ÿ��<?> : Unbounded Wildcards(���� ����)
	 * ->Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ��� Ŭ������ �������̽� Ÿ���� �� �� �ִ�.
	 * 2. ���׸�Ÿ��<? extends ����Ÿ��> : Upper Bounded Wildcards(���� Ŭ���� ����)
	 * ->Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ�Ը� �� �� �ִ�.
	 * 3. ���׸�Ÿ��<? super ����Ÿ��> : Lower Bounded Wildcards(���� Ŭ���� ����)
	 * ->Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ���� �� �� �ִ�.
	 */
	public static void registerCourse(Course<?> course) {//��� ����
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {//�л��� ����л�
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {//�����ΰ� �Ϲ��� ����
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));

		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));

		Course<Student> studentCourse = new Course<>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));

		Course<HighStudent> highStudentCourse = new Course<>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		//registerCourseStudent(personCourse);//(x)
		//registerCourseStudent(workerCourse);//(x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse);//(x)
		//registerCourseWorker(highStudentCourse);//(x)
	}

}
