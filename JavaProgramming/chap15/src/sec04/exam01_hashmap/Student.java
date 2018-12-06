package sec04.exam01_hashmap;

public class Student {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	/* 학번과 이름이 같을 경우 동등한 키로 간주하기 위해서 hashCode()와 equals()메소드를 재정의한다. */
	@Override
	public boolean equals(Object obj) {//학번과 이름이 동일할 경우 true를 리턴
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}

		return false;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();//학번과 이름이 같다면 동일한 값을 리턴
	}
}
