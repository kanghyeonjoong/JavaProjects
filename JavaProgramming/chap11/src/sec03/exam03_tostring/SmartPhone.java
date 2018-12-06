package sec03.exam03_tostring;

public class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	//객체의 toString()메소드를 재정의한다.
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
