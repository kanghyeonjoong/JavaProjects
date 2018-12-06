package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		//�͸� ���� ��ü
		//new ������ �ڿ��� Ŭ���� �̸��� �;� �ϴµ�, �̸��� ����. �������̽�() {}�� �������̽��� �����ؼ� �߰�ȣ{}�� ���� Ŭ������ �����϶�� ���̰�,
		//new �����ڴ� �̷��� ����� Ŭ������ ��ü�� �����Ѵ�.
		RemoteControl rc = new RemoteControl() {
			// �ʵ�
			private int volume;

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
		};
 
		rc.trurnOn();
	}
}
