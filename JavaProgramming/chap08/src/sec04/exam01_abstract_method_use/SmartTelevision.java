package sec04.exam01_abstract_method_use;

public class SmartTelevision implements RemoteControl, Searchable {
	// �ʵ�
	private int volume;

	// Searchable �������̽��� �߻� �޼ҵ� ������
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

	// RemoteControl �������̽��� �߻� �޼ҵ� ������
	@Override
	public void trurnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ���� : " + this.volume);
	}

}
