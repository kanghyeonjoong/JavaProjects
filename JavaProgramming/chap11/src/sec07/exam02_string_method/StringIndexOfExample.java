package sec07.exam02_string_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";

		int location = subject.indexOf("���α׷���");
		System.out.println(location);

		/*
		 * ���ڿ� ã��(indexOf())
		 * indexOf()�޼ҵ�� �Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε��� ��ġ�� �����Ѵ�.
		 * ���� �־��� ���ڿ��� ���ԵǾ� ���� ������ -1�� �����Ѵ�.
		 */
		if (subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}

	}

}
