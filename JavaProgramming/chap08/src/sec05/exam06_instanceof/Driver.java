package sec05.exam06_instanceof;

public class Driver {
	// �Ű� ������ Ÿ���� �������̽��� ���, ��� ���� ��ü�� �Ű������� ����� �� �ְ�,
	// � ���� ��ü�� �����Ǵ��Ŀ� ���� �޼ҵ��� ���� ����� �پ��� �� �� �ִ�.(�Ű� ������ �پ缺)
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();// Bus Ÿ������ ���� Ÿ�� ��ȯ�� �ϴ� ����
		}

		vehicle.run();
	}
}
