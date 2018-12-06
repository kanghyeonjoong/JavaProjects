package sec03.exam04_clone;

//객체 복제는 원본 객체의 필드값과 동일한 값을 가지는 객체를 생성하는 것을 말한다.
//얕은 복제(thin clone)란 단순히 필드값을 복사해서 객체를 복제하는 것을 말한다. 필드값만 복제하기 때문에 
//필드가 기본 타입일 경우 값 복사가 일어나고, 필드가 참조 타입일 경우에는 객체의 번지가 복사된다.
//Object의 clone()메소드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
//clone()메소드로 객체를 복제하려면 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현해야 한다.
//Cloneable 인터페이스가 추상 메소드 선언이 없음에도 불구하고 Cloneable인터페이스를 명시적으로 구현하는 이유는
//복제를 허용한다는 의도적인 표시를 하기 위해서이다.
public class Member implements Cloneable {
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public boolean isAdult() {
		return adult;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			//clone()의 리턴 타입은 Object이므로 Member 타입으로 강제 타입 변환(Casting)해야 한다.
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
		}

		return cloned;
	}
}
