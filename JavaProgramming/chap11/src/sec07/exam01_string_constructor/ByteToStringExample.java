package sec07.exam01_string_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		/*
		 * �ڹ��� ���ڿ��� java.lang.String Ŭ������ �ν��Ͻ��� �����ȴ�. ���ڿ� ���ͷ��� String��ü�� �ڵ� ����������,
		 * String Ŭ������ �پ��� �����ڸ� �̿��ؼ� ���� String ��ü�� ������ �� �ִ�.
		 */
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
