package sec07.exam02_string_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";

		/*
		 * ���ڿ� ��ġ(replace())
		 * replace()�޼ҵ�� ù ��° �Ű����� ���ڿ��� ã�� �� ��° �Ű����� ���ڿ��� ��ġ�� ���ο� ���ڿ��� �����ϰ� �����Ѵ�.
		 * String��ü�� ���ڿ��� ������ �Ұ��� Ư���� ���� ������ replace()�޼ҵ尡 �����ϴ� ���ڿ��� ���� ���ڿ��� �������� �ƴ϶�
		 * ������ ���ο� ���ڿ��̴�.
		 */
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
