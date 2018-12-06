package sec08.exam01_abstract_class;

//실체 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 추상 클래스라고 한다.
//추상 클래스의 용도
//1. 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
//2. 실체 클래스를 작성할 때 시간을 절약
public abstract class Phone {
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
