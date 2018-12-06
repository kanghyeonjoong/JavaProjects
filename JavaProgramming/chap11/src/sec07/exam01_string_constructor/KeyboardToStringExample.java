package sec07.exam01_string_constructor;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) {
		byte[] bytes = new byte[100];// 읽은 바이트를 저장하기 위한 배열 생성

		System.out.print("입력: ");
		try {
			//키보드로에서 입력한 내용을 바이트 배열에 저장하고 읽은 바이트 수를 리턴한다.
			int readByteCount = System.in.read(bytes);

			//바이트 배열을 문자열로 변환
			String str = new String(bytes, 0, readByteCount - 2);//캐리지리턴(13)과 라인피드(10)을 제외함
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
