package sec04.exam04_objects_require_nonnull;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;

		// requireNonNull(T obj)메소드는 매개값이 not null이면 obj를 리턴하고,
		// null이면 NullPointerException을 발생시킨다.
		System.out.println(Objects.requireNonNull(str1));

		try {
			String name = Objects.requireNonNull(str2);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			//requireNonNull(T obj, Supplier<String> msgSupplier)
			String name = Objects.requireNonNull(str2, () -> "이름이 없습니다.");//람다식
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
