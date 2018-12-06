package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		/* 
		 * �ڵ� Boxing 
		 * �ڵ� �ڽ��� ���� Ŭ���� Ÿ�Կ�  �⺻���� ���Ե� ��쿡 �߻��Ѵ�.  �� ������ ��ü�� �����ȴ�.
		 */
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());

		/* 
		 * �ڵ� Unboxing 
		 * �ڵ� ��ڽ��� �⺻  Ÿ�Կ� ���� ��ü�� ���Ե� ��쿡 �߻��Ѵ�.
		 */
		int value = obj;
		System.out.println("value : " + value);

		/* 
		 * ����� �ڵ� Unboxing 
		 * ���� ��ü��  �⺻ Ÿ�԰��� ������ ��쿡�� �߻��Ѵ�.
		 */
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
