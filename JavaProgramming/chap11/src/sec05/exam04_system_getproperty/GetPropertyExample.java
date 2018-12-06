package sec05.exam04_system_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// System Property는 JVM이 시작할 때 자동 설정되는 시스템의 속성값을 말한다.
		// 운영체제의 종류 및 자바 프로그램을 실행시킨 사용자 아이디, JVM의 번전, 운영체제에서 사용되는 파일 경로 구분자 등등...
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉터리 : " + userHome);

		System.out.println("------------------------------------------------");
		System.out.println("      [  key  ]                               value              ");
		System.out.println("------------------------------------------------");

		// System.getProperties() 메소드는 모든 (키, 값)쌍을 저장하고 있는 Properties객체를 리턴한다.
		// 이 객체의 keySet()메소드를 호출하면 키만으로 구성된 Set객체를 얻을 수 있다.
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[  " + key + "  ]" + value);
		}
	}

}
