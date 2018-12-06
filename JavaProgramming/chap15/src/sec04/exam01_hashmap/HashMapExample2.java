package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "È«±æµ¿"), 95);
		map.put(new Student(1, "È«±æµ¿"), 90);
		map.put(new Student(2, "°­°¡µò"), 100);

		System.out.println("ÃÑ Entry ¼ö : " + map.size());

		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			Student student = keyIterator.next();
			Integer value = map.get(student);

			System.out.println(student.getSno() + "\t" + student.getName() + "\t" + value);
		}
		System.out.println();
		
		Set<Map.Entry<Student, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<Student, Integer> entry=entryIterator.next();
			Student student = entry.getKey();
			Integer value=entry.getValue();
			
			System.out.println(student.getSno() + "\t" + student.getName() + "\t" + value);
		}
	}

}
