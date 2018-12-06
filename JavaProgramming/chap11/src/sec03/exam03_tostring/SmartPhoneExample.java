package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("샤오미", "안드로이드");

		String strObj = myPhone.toString();
		System.out.println(strObj);

		// System.out.println()메소드의 매개값으로 객체를 주면 객체의 toString()메소드를 자동으로 호출한다.
		System.out.println(myPhone);
	}

}
