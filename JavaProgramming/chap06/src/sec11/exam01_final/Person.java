package sec11.exam01_final;

public class Person {
	//final �ʵ�� �ʱⰪ�� ����Ǹ� �̰��� �������� ���� �Ǿ ���α׷� ���� ���߿� ������ �� ���ٴ� ���̴�.
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
