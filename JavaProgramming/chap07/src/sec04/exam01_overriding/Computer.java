package sec04.exam01_overriding;

public class Computer extends Calculator {

	//�ڽ�Ŭ�������� �θ� Ŭ������ �޼ҵ带 �������̵��ϰ� �Ǹ�, �θ� Ŭ������ �޼ҵ�� ��������
	//�������̵��� �ڽ� Ŭ������ �޼ҵ常 ���ȴ�.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
