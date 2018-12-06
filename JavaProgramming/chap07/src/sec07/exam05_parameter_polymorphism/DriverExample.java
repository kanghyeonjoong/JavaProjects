package sec07.exam05_parameter_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//�Ű����� �ڵ� Ÿ�� ��ȯ�� �޼ҵ� �������̵��� �̿��ؼ� �Ű������� �������� ������ �� �ִ�.
		driver.drive(new Vehicle());
		driver.drive(bus);
		driver.drive(taxi);
	}

}
