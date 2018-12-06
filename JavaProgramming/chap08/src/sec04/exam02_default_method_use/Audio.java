package sec04.exam02_default_method_use;

public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	private boolean mute;

	// �޼ҵ�
	@Override
	public void trurnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("���� Audio ���� : " + this.volume);
	}

	//������ �޼ҵ�� �������̽��� ��� ���� ��ü�� ������ �ִ� �⺻ �޼ҵ��� �����ϸ� �ȴ�.
	//���� Ŭ������ �ۼ��� �� ����Ʈ �޼ҵ带 ������(�������̵�)�ؼ� �ڽſ��� �°� �����ϸ� ����Ʈ �޼ҵ尡 ȣ��� ��
	//�ڽ��� �������� �޼ҵ尡 ȣ��ȴ�.
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;

		if (mute) {
			System.out.println("Audio ���� ó���մϴ�." );
		} else {
			System.out.println("Audio ���� �����մϴ�." );
		}
	}
}
