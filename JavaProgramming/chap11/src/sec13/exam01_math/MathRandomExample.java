package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		//1 ~ n까지의 난수를 발생하는 공식
		//(int) (Math.random() * n) + 1 ;
		int num = (int) (Math.random() * 6) + 1;

		System.out.println("주사위의 눈: " + num);

	}

}
