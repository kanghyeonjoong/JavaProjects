package sec03.exam04_deep_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		Member cloned = original.getMember();
		try {
			cloned.setScores(0, 100);
			cloned.setScores(1, 80);
			cloned.setScores(2, 80);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		cloned.getCar().setModel("그랜저");

		System.out.println("[복제 객체의 필드값]");
		System.out.println("name : " + cloned.getName());
		System.out.println("age : " + cloned.getAge());
		System.out.print("scores: {");
		for (int i = 0; i < cloned.getScores().length; i++) {
			System.out.print(cloned.getScores()[i]);
			System.out.print((i == (cloned.getScores().length - 1)) ? "" : ", ");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.getCar().getModel());

		System.out.println();

		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.getName());
		System.out.println("age : " + original.getAge());
		System.out.print("scores: {");
		for (int i = 0; i < original.getScores().length; i++) {
			System.out.print(original.getScores()[i]);
			System.out.print((i == (original.getScores().length - 1)) ? "" : ", ");
		}
		System.out.println("}");
		System.out.println("car : " + original.getCar().getModel());

	}

}
