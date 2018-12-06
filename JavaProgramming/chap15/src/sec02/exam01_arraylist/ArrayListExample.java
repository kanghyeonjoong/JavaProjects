package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		/* List 인터페이스는 제네릭 타입(타입 파라미터를 가지는 클래스와 인터페이스)이다. */
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체수: " + size);
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
		 * ArrayList에 객체를 추가하면 인덱스0부터 차례대로 저장된다. ArrayList에서 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지
		 * 모두 앞으로 1씩 당겨진다. 마찬가지로 특정 인덱스에 객체를 삽입하면 해당 인덱스부터 마지막 인덱스까지 모두 1씩 밀려난다.
		 * 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList를 사용하는 것이 바람직하지 않다. 이런 경우라면 LinkedList를 사용하는 것이 좋다.
		 * 그러나 인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는 ArrayList가 더 좋은 성능을 발휘한다.
		 */
		for (int i = 0; i < 2; i++) {
			String removedValue = list.remove(2);
			System.out.println("제거된 값: " + removedValue);
		}
		boolean isRemoved = list.remove("iBATIS");
		System.out.println("iBATIS 제거여부: " + isRemoved);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}

	}

}
