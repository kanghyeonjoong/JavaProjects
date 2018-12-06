package sec05.exam05_system_getenv;

public class SystemEnvExample {

	public static void main(String[] args) {
		// System.getenv()메소드는 운영 체제의 환경 변수를 읽을 때 사용한다.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME : " + javaHome);
	}

}
