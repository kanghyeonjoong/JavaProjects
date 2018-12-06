package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

	//부모클래스에 선언된 final메소드는 자식믈래스에서 재정의할 수 없다.
/*	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
}
