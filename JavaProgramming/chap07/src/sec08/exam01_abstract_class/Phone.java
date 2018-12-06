package sec08.exam01_abstract_class;

//��ü Ŭ�������� �������� Ư���� �����ؼ� ������ Ŭ������ �߻� Ŭ������� �Ѵ�.
//�߻� Ŭ������ �뵵
//1. ��ü Ŭ�������� ����� �ʵ�� �޼ҵ��� �̸��� ������ ����
//2. ��ü Ŭ������ �ۼ��� �� �ð��� ����
public abstract class Phone {
	// �ʵ�
	public String owner;

	// ������
	public Phone(String owner) {
		this.owner = owner;
	}

	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
