package sec05.exam05_system_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		// System.getenv()�޼ҵ�� � ü���� ȯ�� ������ ���� �� ����Ѵ�.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javaHome);
	}

}
