package sec06._throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	// 메소드 내부에서 예외가 발생시 메소드를 호출한 곳으로 예외를 떠넘긴다.
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
