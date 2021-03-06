package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		/*
		 * Hashtable은 HaspMap과 동일한 내부 구조를 가진다. Hashtable도 키로 사용할 객체는 hashCode()와
		 * equals()메소들를 재정의해서 동등 객체가 될 조건을 정해야 한다.
		 * HashMap과의 차이점은 Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에
		 * 이 메소드들을 실행할 수 없고, 하나의 스레드가 완료해야만 다른 스레드를 실행할 수 있다.
		 * 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다.
		 */
		Map<String, String> map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);//키보드로부터 입력된 내용을 받기 위해 생성

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = scanner.next();

			System.out.print("비밀번호: ");
			String password = scanner.next();
			System.out.println();

			if (map.containsKey(id)) {//아이디인 키가 존재하는지 확인
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}

		scanner.close();
	}

}
