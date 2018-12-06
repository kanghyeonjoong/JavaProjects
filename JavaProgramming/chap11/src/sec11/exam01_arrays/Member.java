package sec11.exam01_arrays;

public class Member implements Comparable<Member> {
	private String name;

	public String getName() {
		return name;
	}

	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name) ;
	}

}
