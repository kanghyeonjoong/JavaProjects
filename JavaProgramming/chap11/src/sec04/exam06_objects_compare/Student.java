package sec04.exam06_objects_compare;

public class Student {
	private String studentNo;
	private String studentName;

	public Student(String studentNo, String studentName) {
		this.studentNo= studentNo;
		this.studentName=studentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}
}
