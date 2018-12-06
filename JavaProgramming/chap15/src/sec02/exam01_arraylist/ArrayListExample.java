package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		/* List �������̽��� ���׸� Ÿ��(Ÿ�� �Ķ���͸� ������ Ŭ������ �������̽�)�̴�. */
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		/*
		 * ArrayList�� ��ü�� �߰��ϸ� �ε���0���� ���ʴ�� ����ȴ�. ArrayList���� Ư�� �ε����� ��ü�� �����ϸ� �ٷ� �� �ε������� ������ �ε�������
		 * ��� ������ 1�� �������. ���������� Ư�� �ε����� ��ü�� �����ϸ� �ش� �ε������� ������ �ε������� ��� 1�� �з�����.
		 * ����� ��ü ������ ������ �Ͼ�� �������� ArrayList�� ����ϴ� ���� �ٶ������� �ʴ�. �̷� ����� LinkedList�� ����ϴ� ���� ����.
		 * �׷��� �ε��� �˻��̳�, �� �������� ��ü�� �߰��ϴ� ��쿡�� ArrayList�� �� ���� ������ �����Ѵ�.
		 */
		for (int i = 0; i < 2; i++) {
			String removedValue = list.remove(2);
			System.out.println("���ŵ� ��: " + removedValue);
		}
		boolean isRemoved = list.remove("iBATIS");
		System.out.println("iBATIS ���ſ���: " + isRemoved);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

	}

}
