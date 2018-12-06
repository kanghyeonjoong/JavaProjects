package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/*
		 * LinkedList는 List 구현 클래스이므로 ArrayList와 사용 방법은 똑같지만 내부 구조는 완전 다르다.
		 * ArrayList는 내부 배열에 객체의 번지(객체 참조)를 저장해서 인덱스로 관리하지만, LinkedList는 인접 참조를
		 * 링크해서 체인처럼 관리한다.
		 * 끝에서부터(순차적으로) 추가/삭제하는 경우는 ArrayList가 빠르지만, 중간에 추가 또는 삭제할 경우에는
		 * 앞뒤 링크 정보만 변경하면 되는 LinkedList가 더 빠르다.
		 */
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			//0번 인덱스에 String 객체 추가
			list1.add(0, String.valueOf(i));//기본타입의 값을 문자열로변환
		}
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "\t");
		}
		System.out.println();

		String returnValue = list1.set(0, String.valueOf(0));//0번 인덱스에 저장된 객체를 String객체 0으로 변경한다. 리턴값은 이전에 저장된 값을 리턴한다.
		System.out.println(returnValue);
		System.out.println();
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "\t");
		}
		System.out.println();
		
		endTime = System.nanoTime();
		System.out.println("ArrayList   걸린 시간: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			//0번 인덱스에 String 객체 추가
			list2.add(0, String.valueOf(i));//기본타입의 값을 문자열로변환
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");

	}

}
