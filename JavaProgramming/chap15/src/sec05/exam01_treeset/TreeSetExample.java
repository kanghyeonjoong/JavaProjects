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

		System.out.println("총 객체 수: " + scores.size());
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
		System.out.println("가장 낮은 점수: " + score);

		score = scores.last();
		System.out.println("가장 높은 점수: " + score);

		score = scores.lower(new Integer(95));//주어진 객체보다 바로 아래 객체를 리턴
		System.out.println("95점 아래의 점수: " + score);

		score = scores.higher(new Integer(95));//주어진 객체보다 바로 위 객체를 리턴
		System.out.println("95점 위의 점수: " + score);

		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + score);
		System.out.println();

		while (!scores.isEmpty()) {
			score = scores.pollFirst();//제일 낮은 객체를 꺼내오고 컬렉션에서 제거한다.
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}

}
