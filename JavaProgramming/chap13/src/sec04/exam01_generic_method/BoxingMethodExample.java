package sec04.exam01_generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		/*
		 * ���׸� �޼ҵ� ȣ���ϴ� ���
		 * 1. ����Ÿ�� ���� =<��ü���� Ÿ��>�޼ҵ��(�Ű���);//��������� ��ü���� Ÿ���� ����
		 * 2. ����Ÿ�� ���� = �޼ҵ��(�Ű���);//�Ű����� ���� ��ü���� Ÿ���� ����
		 */
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();//unboxing
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
