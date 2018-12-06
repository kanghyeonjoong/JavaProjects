package sec03.exam01_no_arguments_no_return;

/*
 * 함수적 인터페이스(@FunctionalInterface)
 * 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타켓 타입이 될 수  있는데 이러한 인터페이스를 함수적 인터페이스라고 한다.
 * @FunctionalInterface 어노테이션은 함수적 인터페이스를 작성할 때 두 개 이상(1개만 가능)의 추상 메소드가 선언되지 않도록 컴파일러가 체킹해주는 기능이다.
*/

//매개변수와 리턴 타입이 없는 추상 메소드를 가진 함수적 인터페이스
@FunctionalInterface
public interface MyFunctionalInteface {
	
	public void method();
}
