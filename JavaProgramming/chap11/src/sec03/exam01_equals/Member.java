package sec03.exam01_equals;

import java.util.Objects;

public class Member {
	// 필드
	private String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}

	// 메소드
	public String getId() {
		return id;
	}

	// 두 객체가 동등 비교할 때 equals()메소드를 사용한다. 논리적으로 동등하다는 것은 같은 객체이건 다른 객체이건
	// 상관없이 객체가 저장하고 있는 데이터가 동일함을 뜻한다.
	// String객체의 equals()메소드는 String객체의 번지를 비교하는 것이 아니라, 문자열이 동일한지 조사해서 같으면 true를
	// 리턴하고,
	// 다르면 false를 리턴한다. 이것이 가능한 이유는 String클래스가 Object의 equals()메소드를 재정의 해서 번지 비교가 아닌
	// 문자열 비교로 변경했기 때문이다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {// 매개값이 Member타입인지 확인
			Member member = (Member) obj;// Member타입으로 강제 타입 변환(Casting)

			if (id.equals(member.getId())) {
				return true;
			}
		}

		return false;
	}

	// String 객체의 hashCode()는 같은 문자열일 경우 동일한 해시코드를 리턴한다.
	@Override
	public int hashCode() {
		// return id.hashCode();
		return Objects.hash(id);
	}
}
