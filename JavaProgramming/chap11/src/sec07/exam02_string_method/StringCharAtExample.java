package sec07.exam02_string_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1234567";
		/* charAt(int index) �޼ҵ忡�� �ε����� 0�������� "���ڿ�����-1"������ ��ȣ�� ���Ѵ�. */
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}

	}

}
