package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없다.
		// Phone phone=new Phone() ;
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();// Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();// Phone의 메소드

		Phone phone = new SmartPhone("강가딘");
		phone.turnOn();
		if (phone instanceof SmartPhone) {
			((SmartPhone) phone).internetSearch();
		}
		phone.turnOff();
	}

}
