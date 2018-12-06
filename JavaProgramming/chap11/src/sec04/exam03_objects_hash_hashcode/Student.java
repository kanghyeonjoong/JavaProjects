package sec04.exam03_objects_hash_hashcode;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		//Objects.hash(Object...values)메소드는 매개값으로 주어진 값들을 이용해서 해시 코드를 생성하는데, 주어진 매개값으로 배열을 생성하고
		//Arrays.hashCode(Object[])를 호출해서 해시코드를 얻어 리턴한다.
		//Objects.hash()메소드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용한다.
		return Objects.hash(sno, name);
	}
}
