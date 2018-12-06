package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	//하위 인터페이스를 구현하는 클래스는 하위 인터페이스의 메소드뿐만 아니라 상위 인터페이스의 모든 
	//추상 메소드에 대한 실체 메소드를 가지고 있어야 한다.
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");

	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");

	}

}
