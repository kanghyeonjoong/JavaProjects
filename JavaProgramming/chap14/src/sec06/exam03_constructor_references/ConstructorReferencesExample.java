package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		/*
		 * ������ ���� : Ŭ���� �̸� �ڿ� :: ��ȣ�� ���̰� new �����ڸ� ����Ѵ�.
		 * (a, b)->{ return new Ŭ����(a, b); }
		 * =>Ŭ����::new
		 * �޼ҵ� ������ ������ ������ �����Ѵ�.
		 */
		Function<String, Member> function1;
		function1 = (x) -> new Member(x);
		Member member1 = function1.apply("blue");

		function1 = Member::new;//����������
		member1 = function1.apply("blue");

		BiFunction<String, String, Member> function2;
		function2 = (x, y) -> new Member(x, y);
		Member member2 = function2.apply("������", "blue");

		function2 = Member::new;//������ ����
		member2 = function2.apply("������", "blue");

	}

}
