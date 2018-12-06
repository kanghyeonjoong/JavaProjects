package verify.exam04;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		/* ���ٽ� �ȿ��� �޼ҵ��� �Ű������� ���� ������ ����ϸ� final�Ӽ��� ������. */
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
