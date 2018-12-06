package sec05.exam02_anonymous_implements;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");

		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");

		}
	};

	void method1() {
		// ���� ���������� ����
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");

			}

			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");

			}
		};

		// ���� ���� ���
		localVar.turnOn();
	}

	// �Ű������� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
