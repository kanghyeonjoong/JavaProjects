package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	// �ʵ�
	int channel;

	// ������
	public DmbCellPhone(String model, String color, int channel) {
		// CellPhone���κ��� ��ӹ��� �ʵ�
		this.model = model;
		this.color = color;
//		super(model, color);
		
		this.channel = channel;
	}

	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
