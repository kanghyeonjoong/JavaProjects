package sec10.exam03_static_be_careful;

public class Car {
	// �ʵ�
	int speed;

	// �޼ҵ�
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
