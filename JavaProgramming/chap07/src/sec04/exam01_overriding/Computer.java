package sec04.exam01_overriding;

public class Computer extends Calculator {

	//자식클래스에서 부모 클래스의 메소드를 오버라이딩하게 되면, 부모 클래스의 메소드는 숨겨지고
	//오버라이딩된 자식 클래스의 메소드만 사용된다.
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
