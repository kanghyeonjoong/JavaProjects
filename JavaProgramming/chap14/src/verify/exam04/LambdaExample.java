package verify.exam04;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		/* 람다식 안에서 메소드의 매개변수와 로컬 변수를 사용하면 final속성을 가진다. */
		IntSupplier supplier = () -> {
			return (x * 10) + y;
		};

		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}

}
