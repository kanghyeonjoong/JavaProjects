package sec04.exam02_super;

public class SupersonicAirPlane extends AirPlane {
	// ��� ����
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			//AirPlane��ü�� fly()�޼ҵ带 ȣ��
			//�ڽ� Ŭ���� ���ο��� �������̵��� �θ� Ŭ������ �޼ҵ带 ȣ���ؾ� �ϴ� ��Ȳ�� �߻��ϸ� superŰ���带 �ٿ���
			//�θ� �޼ҵ带 ȣ���� �� �ִ�.
			super.fly();
		}
	}
}
