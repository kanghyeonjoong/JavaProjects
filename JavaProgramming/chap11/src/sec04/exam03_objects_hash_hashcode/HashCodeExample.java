package sec04.exam03_objects_hash_hashcode;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}

}
