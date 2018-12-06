package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		/* HashSet은 객체들을 순서없이 저장하고 동일한 객체는 중복 저장하지 않는다. */
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 30, "서울"));
		set.add(new Member("홍길동", 30, "부산"));
		set.add(new Member("강가딘", 47, "부산"));
		
		System.out.println("총 객체수: " + set.size());

		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName() + "\t" + member.getAge() + "\t" + member.getCity());
		}
	}

}
