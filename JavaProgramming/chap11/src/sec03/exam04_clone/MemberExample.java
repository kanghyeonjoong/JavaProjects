package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);

		// ���� ��ü�� ���� �� �н����� ����
		Member cloned = original.getMember();

		cloned.setPassword("67890");

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + cloned.getId());
		System.out.println("name : " + cloned.getName());
		System.out.println("password : " + cloned.getPassword());
		System.out.println("age : " + cloned.getAge());
		System.out.println("adult : " + cloned.isAdult());

		System.out.println();

		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id : " + original.getId());
		System.out.println("name : " + original.getName());
		System.out.println("password : " + original.getPassword());
		System.out.println("age : " + original.getAge());
		System.out.println("adult : " + original.isAdult());

	}

}
