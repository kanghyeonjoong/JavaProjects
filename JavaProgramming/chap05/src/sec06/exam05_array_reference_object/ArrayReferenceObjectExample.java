package sec06.exam05_array_reference_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		/*
		 * �⺻ Ÿ�� �迭�� �� �׸� ���� ���� ������ ������, ���� Ÿ��(Ŭ����,�������̽�) �迭�� �� �׸� ��ü�� ������ ������ �ִ�.
		 * String�� Ŭ���� Ÿ���̹Ƿ� String[]�迭�� �� �׸� ���ڿ��� �ƴ϶�, String��ü�� �ּҸ� ������ �ִ�.
		 */
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);// true
		System.out.println(strArray[0] == strArray[2]);// false
		System.out.println(strArray[0].equals(strArray[2]));// true

	}

}
