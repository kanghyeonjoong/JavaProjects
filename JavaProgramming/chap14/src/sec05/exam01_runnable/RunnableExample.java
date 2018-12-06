package sec05.exam01_runnable;

public class RunnableExample {

	public static void main(String[] args) {
		/*
		 * 표준 API에서 한 개의 추상 메소드를 가지는 인터페이스들은 모두 람다식을 이용해서
		 * 익명 구현 객체로 표현이 가능하다.
		 * 자바에서는 빈번하게 사용되는 함수적 인터페이스(functional interface)는 java.util.function 표준API 패키지로 제공한다.
		 * 이 패키지에서 제공하는 함수적 인터페이스의 목적은 메소드 또는 생성자의 매개 타입으로  사용되어 람다식을 대입할 수 있도록 하기 위해서이다.
		 */
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		//방법1
		Thread thread = new Thread(runnable);
		thread.start();
		
		//방법2
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		System.out.println();
		thread2.start();
	}

}
