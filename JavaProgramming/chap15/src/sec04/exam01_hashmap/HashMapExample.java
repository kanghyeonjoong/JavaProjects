package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		/*
		 * Map�÷����� Ű(key)�� ��(value)���� ������ Entry��ü�� �����ϴ� �����̴�. ���⼭ Ű�� ���� ��� ��ü�̴�.
		 * Ű�� �ߺ� ����� �� ������ ���� �ߺ� ����� �� �ִ�. ���� ������ ����� Ű�� ������ Ű�� ���� �����ϸ�
		 * ������ ���� �������� ���ο� ������ ��ġ�ȴ�.
		 */

		/*
		 * HaspMap�� Ű�� ����� ��ü�� hashCode()�� euqals()�޼ҵ带 �������ؼ� ���� ��ü�� �� ������ ���ؾ� �Ѵ�.
		 * ���� ��ü, �� ������ Ű�� �� ������ hashCode()�� ���ϰ��� ���ƾ� �ϰ�, equals()�޼ҵ尡 true�� �����ؾ� �Ѵ�.
		 * �ַ� Ű Ÿ���� String�� ���� ����ϴµ�, String�� ���ڿ��� ���� ��� ���� ��ü�� �� �� �ֵ��� hashCode()�� equals()
		 * �޼ҵ尡 �����ǵǾ� �ִ�.
		 * Ű�� ���� Ÿ���� �⺻ Ÿ��(byte, short, int, float, double, boolean, char)�� ����� �� ���� Ŭ������ �������̽� Ÿ�Ը� �����ϴ�.
		 */
		Map<String, Integer> map = new HashMap<>();

		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��: " + map.size());

		//��ü ã��
		System.out.println("\tȫ�浿: " + map.get("ȫ�浿"));//�̸�(Ű)�� ����(��)�� ����
		System.out.println();

		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();//key Set ���
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();//�ݺ��ڸ� ����
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();


		//��ü ����
		map.remove("ȫ�浿");//Ű�� Map.Entry�� ����
		System.out.println("�� Entry ��: " + map.size());
	
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator2 = entrySet2.iterator();
		while (entryIterator2.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}

}
