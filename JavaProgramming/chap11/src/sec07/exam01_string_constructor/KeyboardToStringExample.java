package sec07.exam01_string_constructor;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) {
		byte[] bytes = new byte[100];// ���� ����Ʈ�� �����ϱ� ���� �迭 ����

		System.out.print("�Է�: ");
		try {
			//Ű����ο��� �Է��� ������ ����Ʈ �迭�� �����ϰ� ���� ����Ʈ ���� �����Ѵ�.
			int readByteCount = System.in.read(bytes);

			//����Ʈ �迭�� ���ڿ��� ��ȯ
			String str = new String(bytes, 0, readByteCount - 2);//ĳ��������(13)�� �����ǵ�(10)�� ������
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
