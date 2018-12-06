package sec07.exam02_string_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";

		byte[] bytes1 = str.getBytes();//�⺻ ���ڼ����� ���ڵ�
		System.out.println("byte1.length : " + bytes1.length);//2bytes*5=10
		String str1 = new String(bytes1);//�⺻ ���ڼ����� ���ڵ�
		System.out.println("bytes1->String: " + str1);
		System.out.println();

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			;//EUC-KR�� �̿��ؼ� ���ڵ�
			System.out.println("bytes2.length: " + bytes2.length);//2bytes*5=10
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			System.out.println();

			byte[] bytes3 = str.getBytes("UTF-8");//UTF-8�� �̿��ؼ� ���ڵ�
			System.out.println("bytes3.length: " + bytes3.length);//3bytes*5=15
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
