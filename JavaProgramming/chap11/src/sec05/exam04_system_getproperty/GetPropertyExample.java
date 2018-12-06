package sec05.exam04_system_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// System Property�� JVM�� ������ �� �ڵ� �����Ǵ� �ý����� �Ӽ����� ���Ѵ�.
		// �ü���� ���� �� �ڹ� ���α׷��� �����Ų ����� ���̵�, JVM�� ����, �ü������ ���Ǵ� ���� ��� ������ ���...
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("�ü�� �̸� : " + osName);
		System.out.println("����� �̸� : " + userName);
		System.out.println("����� Ȩ���͸� : " + userHome);

		System.out.println("------------------------------------------------");
		System.out.println("      [  key  ]                               value              ");
		System.out.println("------------------------------------------------");

		// System.getProperties() �޼ҵ�� ��� (Ű, ��)���� �����ϰ� �ִ� Properties��ü�� �����Ѵ�.
		// �� ��ü�� keySet()�޼ҵ带 ȣ���ϸ� Ű������ ������ Set��ü�� ���� �� �ִ�.
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[  " + key + "  ]" + value);
		}
	}

}
