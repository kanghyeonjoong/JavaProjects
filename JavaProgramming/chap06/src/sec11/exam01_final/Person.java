package sec11.exam01_final;

public class Person {
	//final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없다는 것이다.
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
