package sec04.exam05_objects_tostring;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;

		//��ü�� ���� ������ �����Ѵ�.
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
	}

}
