package sec05.exam02_field_polymorphism;

public class Car {
	// �ʵ�
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü ����
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//�żҵ�
	void run() {
		//�������̽����� ����� roll()�޼ҵ� ȣ��
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
