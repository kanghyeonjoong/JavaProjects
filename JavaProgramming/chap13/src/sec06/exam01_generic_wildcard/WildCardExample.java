package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	/*
	 * 제네릭 타입(타입 파라미터를 가지는 클래스나 인터페이스)을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신에
	 * 와일드 카드(?)를 세 가지 형태로 사용할 수 있다.
	 * 1. 제네릭타입<?> : Unbounded Wildcards(제한 없음)
	 * ->타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
	 * 2. 제네릭타입<? extends 상위타입> : Upper Bounded Wildcards(상위 클래스 제한)
	 * ->타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입만 올 수 있다.
	 * 3. 제네릭타입<? super 하위타입> : Lower Bounded Wildcards(하위 클래스 제한)
	 * ->타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
	 */
	public static void registerCourse(Course<?> course) {//모든 과정
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {//학생과 고등학생
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {//직장인과 일반인 과정
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));

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
