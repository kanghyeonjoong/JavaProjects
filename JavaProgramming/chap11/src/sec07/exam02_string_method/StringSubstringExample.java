package sec07.exam02_string_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";

		/*
		 * ���ڿ� �߶󳻱�(substring())
		 * substring(int beginIndex, int endIndex)�� �־��� ���۰� ��(����) �ε��� ������ ���ڿ��� �����ϰ�,
		 * substring(int beginIndex)�� �־��� �ε������� ������ ���ڿ��� �����Ѵ�.
		 */
		String firstNum = ssn.substring(0, 6);//�ε��� 0(����)~6(����) ������ ���ڿ��� ������
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
