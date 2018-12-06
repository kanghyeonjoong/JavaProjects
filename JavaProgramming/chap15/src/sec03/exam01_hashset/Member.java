package sec03.exam01_hashset;

public class Member {
	private String name;
	private int age;
	private String city;

	public Member(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	/*
	 * 사용자 정의 클래스 Member를 만들고 hasCode()와 equals()메소드를 오버라이딩(재정의)하였다.
	 * 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주하여 중복 저장되지 않도록 하기 위해서이다.
	 * 같은 문자열을 갖는 String 객체가 동등한 객체로 간주되는 것은 String 클래스가 hashCode()와 equals() 메소드를 재정의해서
	 * 같은 문자열일 경우 hasCode()의 리턴값을 같게, equals()의 리턴값은 true가 나오도록 했기 때문이다.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (name == member.getName()) && (age == member.getAge());
		}

		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
