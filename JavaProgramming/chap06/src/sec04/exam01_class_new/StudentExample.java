package sec04.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) {
		//new연산자는 힙 영역에 객체를 생성시킨 후, 객체의 주소를 리턴한다.
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");
	}

}
