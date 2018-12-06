package sec07.exam03_field_polymorphism;

public class Tire {
	// �ʵ�
	public int maxRotation;// �ִ� ������(Ÿ�̾� ����)
	public int accumulatedRotation;// ���� ȸ����
	public String location;// Ÿ�̾��� ��ġ

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;// ���� ȸ���� 1����;
		if (accumulatedRotation < maxRotation) {
			//���� ȸ��
			System.out.println(location + "Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			//��ũ
			System.out.println("***" + location + " Tire ��ũ ***");
			return false;
		}
	}
}
