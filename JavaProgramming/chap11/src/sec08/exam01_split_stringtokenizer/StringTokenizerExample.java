package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";

		/*
		 * StringTokenizerŬ����
		 * ���ڿ��� �� ������ �����ڷ� ����Ǿ� ���� ��� ����Ѵ�.
		 * StringTokenizer ��ü�� ������ �� ù ��° �Ű������� ��ü ���ڿ��� �ְ�, �� ��° �Ű������� �����ڸ� �ָ� �ȴ�.
		 * �����ڸ� �����ϸ� ����(space)�� �⺻ �����ڰ� �ȴ�.
		 */
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		/*
		 * nextToken()�޼ҵ�� ��ū�� �ϳ� �������� StringTokenizer��ü���� �ش� ��ū�� ��������.
		 * StringTokenizer��ü���� �� �̻� ������ ��ū�� ���ٸ� nextToken()�޼ҵ��
		 * java.util.NoSuchElementException ���ܸ� �߻���Ų��.
		 * �׷��� nextToken()�޼ҵ带 ����ϱ� ���� hasMoreTokens()�޼ҵ�� ������ ��ū�� �ִ��� ������ ��
		 * nextToken()�޼ҵ带 ȣ���Ѵ�.
		 */
		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
