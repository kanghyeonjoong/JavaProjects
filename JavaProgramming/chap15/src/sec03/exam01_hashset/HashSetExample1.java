package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		/*
		 * List 컬렉션은 저장 순서를 유지하지만, Set컬렉션은 저장 순서가 유지되지 않는다. 또한 객체를 중복해서 저장할 수 없고,
		 * 하나의 null만 저장할 수 있다.
		 * Set은 인덱스로 관리되지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다.
		 * Set 인터페이스의 메소드의 매개 변수와 리턴 타입에는 E라는 타입 파라미터가 있는데, 이것은 Set 인터페이스가 제네릭 타입이기 때문이다.
		 * 구체적인 타입은 구현 객체를 생성할 때 결정된다.
		 * Set컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다. 대신, 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
		 * 반복자는 Iterator 인터페이스를 구현한 객체를 말하는데, iterator()메소드를 호출하면 얻을 수 있다.
		 */
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		boolean bProcess = set.add("Java");
		System.out.println("중복여부: " + ((bProcess == false) ? "중복발생" : "객체추가"));
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체수: " + size);

		Iterator<String> iterator = set.iterator();//Iterator 생성
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}

}
