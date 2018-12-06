package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		/*
		 * Map컬렉션은 키(key)와 값(value)으로 구성된 Entry객체를 저장하는 구조이다. 여기서 키와 값은 모두 객체이다.
		 * 키는 중복 저장될 수 없지만 값은 중복 저장될 수 있다. 만약 기존에 저장된 키와 동일한 키로 값을 저장하면
		 * 기존의 값은 없어지고 새로운 값으로 대치된다.
		 */

		/*
		 * HaspMap의 키로 사용할 객체는 hashCode()와 euqals()메소드를 재정의해서 동등 객체가 될 조건을 정해야 한다.
		 * 동등 객체, 즉 동일한 키가 될 조건은 hashCode()의 리턴값이 같아야 하고, equals()메소드가 true를 리턴해야 한다.
		 * 주로 키 타입은 String을 많이 사용하는데, String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode()와 equals()
		 * 메소드가 재정의되어 있다.
		 * 키와 값의 타입은 기본 타입(byte, short, int, float, double, boolean, char)을 사용할 수 없고 클래스와 인터페이스 타입만 가능하다.
		 */
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());

		//객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));//이름(키)로 점수(값)을 리턴
		System.out.println();

		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();//key Set 얻기
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
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();//반복자를 얻음
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


		//객체 제거
		map.remove("홍길동");//키로 Map.Entry를 제거
		System.out.println("총 Entry 수: " + map.size());
	
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator2 = entrySet2.iterator();
		while (entryIterator2.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}

}
