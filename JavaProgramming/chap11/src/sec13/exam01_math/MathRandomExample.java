package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		//1 ~ n������ ������ �߻��ϴ� ����
		//(int) (Math.random() * n) + 1 ;
		int num = (int) (Math.random() * 6) + 1;

		System.out.println("�ֻ����� ��: " + num);

	}

}
