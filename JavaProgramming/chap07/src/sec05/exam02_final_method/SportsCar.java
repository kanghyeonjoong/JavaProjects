package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

	//�θ�Ŭ������ ����� final�޼ҵ�� �ڽĹɷ������� �������� �� ����.
/*	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}*/
}
