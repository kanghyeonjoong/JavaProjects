package sec03.exam02_hashcode;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;

			if (this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}
	
	//객체 해시코드란 객체를 식별할 하나의 정수값을 말한다. Object의 hashCode()  메소드는 객체의 메모리 번지를 이용해서
	//해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있다.
	//논리적 동등 비교 시 hashCode()를 재정의할 필요성이 있는데, 컬렉션 프레임워크에서 HashSet, HashMap, Hashtable은
	//다음과 같은 방법으로 두 객체가 동등한지 비교한다.
	//우선 hashCode()메소드를 실행해서 리턴된 해시코드 값이 같은지 본다. 해시코드 값이 다르면 다른 객체로 판단하고, 해시코드 값이
	//같으면 equals()메소드로 다시 비교한다.
	@Override
	public int hashCode() {
		
		return this.number;
	}
}
