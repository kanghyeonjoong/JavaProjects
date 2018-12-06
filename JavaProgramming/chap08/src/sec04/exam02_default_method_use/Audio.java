package sec04.exam02_default_method_use;

public class Audio implements RemoteControl {
	// 필드
	private int volume;
	private boolean mute;

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

	//디폴드 메소드는 인터페이스의 모든 구현 객체가 가지고 있는 기본 메소드라고 생각하면 된다.
	//구현 클래스를 작성할 때 디폴트 메소드를 재정의(오버라이딩)해서 자신에게 맞게 수정하면 디폴트 메소드가 호출될 때
	//자신을 재정의한 메소드가 호출된다.
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;

		if (mute) {
			System.out.println("Audio 무음 처리합니다." );
		} else {
			System.out.println("Audio 무음 해제합니다." );
		}
	}
}
