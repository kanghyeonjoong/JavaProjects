package sec06._throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	// �޼ҵ� ���ο��� ���ܰ� �߻��� �޼ҵ带 ȣ���� ������ ���ܸ� ���ѱ��.
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
