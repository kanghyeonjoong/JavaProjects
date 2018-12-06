package sec03.exam01_parent_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);//부모생성자 호출
		this.studentNo=studentNo;
	}
}
