package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		/* HashSet�� ��ü���� �������� �����ϰ� ������ ��ü�� �ߺ� �������� �ʴ´�. */
		Set<Member> set = new HashSet<>();

		set.add(new Member("ȫ�浿", 30, "����"));
		set.add(new Member("ȫ�浿", 30, "�λ�"));
		set.add(new Member("������", 47, "�λ�"));
		
		System.out.println("�� ��ü��: " + set.size());

		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.getName() + "\t" + member.getAge() + "\t" + member.getCity());
		}
	}

}
