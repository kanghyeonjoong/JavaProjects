package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		/*
		 * Hashtable�� HaspMap�� ������ ���� ������ ������. Hashtable�� Ű�� ����� ��ü�� hashCode()��
		 * equals()�޼ҵ鸦 �������ؼ� ���� ��ü�� �� ������ ���ؾ� �Ѵ�.
		 * HashMap���� �������� Hashtable�� ����ȭ�� �޼ҵ�� �����Ǿ� �ֱ� ������ ��Ƽ �����尡 ���ÿ�
		 * �� �޼ҵ���� ������ �� ����, �ϳ��� �����尡 �Ϸ��ؾ߸� �ٸ� �����带 ������ �� �ִ�.
		 * �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ�.
		 */
		Map<String, String> map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);//Ű����κ��� �Էµ� ������ �ޱ� ���� ����

		while (true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id = scanner.next();

			System.out.print("��й�ȣ: ");
			String password = scanner.next();
			System.out.println();

			if (map.containsKey(id)) {//���̵��� Ű�� �����ϴ��� Ȯ��
				if (map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}

		scanner.close();
	}

}