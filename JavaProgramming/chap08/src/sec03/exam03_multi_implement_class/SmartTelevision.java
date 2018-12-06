package sec03.exam03_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	private int volume;

	// Searchable 인터페이스의 추상 메소드 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	// RemoteControl 인터페이스의 추상 메소드 재정의
	@Override
	public void trurnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
