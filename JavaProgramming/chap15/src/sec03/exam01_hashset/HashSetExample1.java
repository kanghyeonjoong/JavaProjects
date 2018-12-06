package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		/*
		 * List �÷����� ���� ������ ����������, Set�÷����� ���� ������ �������� �ʴ´�. ���� ��ü�� �ߺ��ؼ� ������ �� ����,
		 * �ϳ��� null�� ������ �� �ִ�.
		 * Set�� �ε����� �������� �ʱ� ������ �ε����� �Ű������� ���� �޼ҵ尡 ����.
		 * Set �������̽��� �޼ҵ��� �Ű� ������ ���� Ÿ�Կ��� E��� Ÿ�� �Ķ���Ͱ� �ִµ�, �̰��� Set �������̽��� ���׸� Ÿ���̱� �����̴�.
		 * ��ü���� Ÿ���� ���� ��ü�� ������ �� �����ȴ�.
		 * Set�÷����� �ε����� ��ü�� �˻��ؼ� �������� �޼ҵ尡 ����. ���, ��ü ��ü�� ������� �ѹ��� �ݺ��ؼ� �������� �ݺ���(Iterator)�� �����Ѵ�.
		 * �ݺ��ڴ� Iterator �������̽��� ������ ��ü�� ���ϴµ�, iterator()�޼ҵ带 ȣ���ϸ� ���� �� �ִ�.
		 */
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		boolean bProcess = set.add("Java");
		System.out.println("�ߺ�����: " + ((bProcess == false) ? "�ߺ��߻�" : "��ü�߰�"));
		set.add("iBATIS");

		int size = set.size();
		System.out.println("�� ��ü��: " + size);

		Iterator<String> iterator = set.iterator();//Iterator ����
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("�� ��ü��: " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}

	}

}
