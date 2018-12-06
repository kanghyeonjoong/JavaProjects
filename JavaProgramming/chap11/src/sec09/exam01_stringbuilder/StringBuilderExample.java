package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		/*
		 * ���ڿ��� �����ϴ� String�� ������ ���ڿ��� ������ �� ����.
		 * �����ϸ� ���ο� ���ڿ��� ������ �� �����Ѵ�.
		 * java.lang ��Ű���� StringBuffer �Ǵ� StringBuilder Ŭ������ ����ϸ� ����. �� �� Ŭ������
		 * ���� ���ۿ� ���ڿ��� ������ �ΰ�, �� �ȿ��� �߰�, ����, ���� �۾��� �Ѵ�.
		 */
		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("�ѹ��ڼ� : " + length);

		String result = sb.toString();
		System.out.println(result);
	}

}
