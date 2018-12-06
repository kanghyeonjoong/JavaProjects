package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		/*
		 * ArrayList�� �����ϰ� ��Ÿ�� �ÿ� �ʿ信 ���� ��ü���� �߰��ϴ� ���� �Ϲ���������,
		 * ������ ��ü��� ������ List�� ������ ���� �ִ�.
		 */
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");

		for (String name : list) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}

}
