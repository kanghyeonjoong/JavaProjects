package sec07.exam05_parameter_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값의 자동 타입 변환과 메소드 오버라이딩을 이용해서 매개변수의 다형성을 구현할 수 있다.
		driver.drive(new Vehicle());
		driver.drive(bus);
		driver.drive(taxi);
	}

}
