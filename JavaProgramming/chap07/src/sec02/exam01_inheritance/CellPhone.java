package sec02.exam01_inheritance;

//�θ�Ŭ����
public class CellPhone {
	// �ʵ�(default)
	String model;
	String color;

	// ������
	/*public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}*/

	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڱ�: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}

	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
