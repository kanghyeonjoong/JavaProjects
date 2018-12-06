package verify.exam03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	//Object의 equals()와 hashCode()메소드를 재정의(Overriding)해서 
	//Student의 학번(studentNum)이 같으면 동등 객체가 될 수 있도록 한다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
