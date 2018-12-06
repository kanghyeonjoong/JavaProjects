package sec10.exam04_singletone;

public class SingletoneExample {
	public static void main(String[] args) {
		Singletone obj1 = Singletone.getInstance();
		Singletone obj2 = Singletone.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singletone 객체 입니다.");
		} else {
			System.out.println("다른 singletone 객체 입니다.");
		}
	}
}
