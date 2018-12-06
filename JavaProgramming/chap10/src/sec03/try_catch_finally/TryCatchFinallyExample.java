package sec03.try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			// Class.forName()메소드는 매개값으로 주어진 클래스가 존재하면 Class객체를 리턴하지만
			// 존재하지 않으면 ClassNotFoundException 예외를 발생시킨다.
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
