package sec05.exam05_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		// vehicle.checkFare();//Vehicle �������̽����� checkFare()�� ����

		Bus bus = (Bus) vehicle;//����Ÿ�Ժ�ȯ
		bus.run();
		bus.checkFare();//Bus Ŭ�������� checkFare()�� ����
	}

}
