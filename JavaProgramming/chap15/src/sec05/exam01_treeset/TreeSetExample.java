package sec05.exam01_treeset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		List<Integer> list = Arrays.asList(75, 95, 80);
		scores.addAll(list);

		System.out.println("�� ��ü ��: " + scores.size());
		System.out.println();
		
		Iterator<Integer> iterator = scores.iterator();
		while (iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.print(value+ "\t");
		}
		System.out.println();
		System.out.println();
		
		Integer score = null;

		score = scores.first();
		System.out.println("���� ���� ����: " + score);

		score = scores.last();
		System.out.println("���� ���� ����: " + score);

		score = scores.lower(new Integer(95));//�־��� ��ü���� �ٷ� �Ʒ� ��ü�� ����
		System.out.println("95�� �Ʒ��� ����: " + score);

		score = scores.higher(new Integer(95));//�־��� ��ü���� �ٷ� �� ��ü�� ����
		System.out.println("95�� ���� ����: " + score);

		score = scores.floor(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ����: " + score);
		System.out.println();

		while (!scores.isEmpty()) {
			score = scores.pollFirst();//���� ���� ��ü�� �������� �÷��ǿ��� �����Ѵ�.
			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
		}
	}

}