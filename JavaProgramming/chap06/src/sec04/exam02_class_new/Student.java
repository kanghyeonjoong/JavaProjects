package sec04.exam02_class_new;

public class Student {

	void method1() {
		System.out.println("medthod1() ȣ��");
	}

	void method2() {
		System.out.println("medthod2() ȣ��");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.method1();

		Student s2 = new Student();
		s2.method2();
	}
}
