package sec07.exam02_string_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		/*
		 * ���ڿ� ��ȯ(valueOf())
		 * valueOf()�޼ҵ�� �⺻ Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ����� ������.
		 * StringŬ�������� �Ű� ������ Ÿ�Ժ��� valueOf()�޼ҵ尡 �����ε��Ǿ� �ִ�.
		 */
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
