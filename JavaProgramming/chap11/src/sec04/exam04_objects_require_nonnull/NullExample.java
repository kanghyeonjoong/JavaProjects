package sec04.exam04_objects_require_nonnull;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;

		// requireNonNull(T obj)�޼ҵ�� �Ű����� not null�̸� obj�� �����ϰ�,
		// null�̸� NullPointerException�� �߻���Ų��.
		System.out.println(Objects.requireNonNull(str1));

		try {
			String name = Objects.requireNonNull(str2);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�.");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		try {
			//requireNonNull(T obj, Supplier<String> msgSupplier)
			String name = Objects.requireNonNull(str2, () -> "�̸��� �����ϴ�.");//���ٽ�
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
