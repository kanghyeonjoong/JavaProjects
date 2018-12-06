package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		//익명 구현 객체
		//new 연산자 뒤에는 클래스 이름이 와야 하는데, 이름이 없다. 인터페이스() {}는 인터페이스를 구현해서 중괄호{}와 같이 클래스를 선언하라는 뜻이고,
		//new 연산자는 이렇게 선언된 클래스를 객체로 생성한다.
		RemoteControl rc = new RemoteControl() {
			// 필드
			private int volume;

			// 메소드
			@Override
			public void trurnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
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

				System.out.println("현재 Audio 볼륨 : " + this.volume);
			}
		};
 
		rc.trurnOn();
	}
}
