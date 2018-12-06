package sec03.exam01_name_implement_class;

//인터페이스는 객체의 사용 방법을 정의한 타입이다.
//인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라서
//실행 내용과 리턴값이 다를 수 있다.
public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// 추상 메소드
	public abstract void trurnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
