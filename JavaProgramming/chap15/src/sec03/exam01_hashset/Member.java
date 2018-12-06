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
	 * ����� ���� Ŭ���� Member�� ����� hasCode()�� equals()�޼ҵ带 �������̵�(������)�Ͽ���.
	 * �ν��Ͻ��� �޶� �̸��� ���̰� �����ϴٸ� ������ ��ü�� �����Ͽ� �ߺ� ������� �ʵ��� �ϱ� ���ؼ��̴�.
	 * ���� ���ڿ��� ���� String ��ü�� ������ ��ü�� ���ֵǴ� ���� String Ŭ������ hashCode()�� equals() �޼ҵ带 �������ؼ�
	 * ���� ���ڿ��� ��� hasCode()�� ���ϰ��� ����, equals()�� ���ϰ��� true�� �������� �߱� �����̴�.
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
