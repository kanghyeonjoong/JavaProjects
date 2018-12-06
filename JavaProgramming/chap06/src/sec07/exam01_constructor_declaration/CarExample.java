package sec07.exam01_constructor_declaration;

public class CarExample {

	public static void main(String[] args) {
//		Car myCar=new Car();

		// 클래스에 생성자가 명시적으로 선언되어 있을 경우에는 반드시 선언된 생성자를 호출해서 객체를 생성해야 한다.
		Car myCar = new Car("검정", 3000);

	}

}
