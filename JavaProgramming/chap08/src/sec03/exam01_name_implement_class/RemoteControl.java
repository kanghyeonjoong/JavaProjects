package sec03.exam01_name_implement_class;

//�������̽��� ��ü�� ��� ����� ������ Ÿ���̴�.
//�������̽��� �ϳ��� ��ü�� �ƴ϶� ���� ��ü��� ����� �����ϹǷ� � ��ü�� ����ϴ��Ŀ� ����
//���� ����� ���ϰ��� �ٸ� �� �ִ�.
public interface RemoteControl {
	// ���
	int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// �߻� �޼ҵ�
	public abstract void trurnOn();

	void turnOff();

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
