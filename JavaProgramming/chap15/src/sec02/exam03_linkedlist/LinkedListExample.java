package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/*
		 * LinkedList�� List ���� Ŭ�����̹Ƿ� ArrayList�� ��� ����� �Ȱ����� ���� ������ ���� �ٸ���.
		 * ArrayList�� ���� �迭�� ��ü�� ����(��ü ����)�� �����ؼ� �ε����� ����������, LinkedList�� ���� ������
		 * ��ũ�ؼ� ü��ó�� �����Ѵ�.
		 * ����������(����������) �߰�/�����ϴ� ���� ArrayList�� ��������, �߰��� �߰� �Ǵ� ������ ��쿡��
		 * �յ� ��ũ ������ �����ϸ� �Ǵ� LinkedList�� �� ������.
		 */
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			//0�� �ε����� String ��ü �߰�
			list1.add(0, String.valueOf(i));//�⺻Ÿ���� ���� ���ڿ��κ�ȯ
		}
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "\t");
		}
		System.out.println();

		String returnValue = list1.set(0, String.valueOf(0));//0�� �ε����� ����� ��ü�� String��ü 0���� �����Ѵ�. ���ϰ��� ������ ����� ���� �����Ѵ�.
		System.out.println(returnValue);
		System.out.println();
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "\t");
		}
		System.out.println();
		
		endTime = System.nanoTime();
		System.out.println("ArrayList   �ɸ� �ð�: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			//0�� �ε����� String ��ü �߰�
			list2.add(0, String.valueOf(i));//�⺻Ÿ���� ���� ���ڿ��κ�ȯ
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ� �ð�: " + (endTime - startTime) + " ns");

	}

}
