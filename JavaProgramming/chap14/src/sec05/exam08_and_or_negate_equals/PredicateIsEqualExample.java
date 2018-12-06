package sec05.exam08_and_or_negate_equals;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		/*
		 * Predicate<T>�Լ��� �������̽��� and(), or(), negate() ����Ʈ �޼ҵ� �ܿ� isEqual()���� �޼ҵ带 �����Ѵ�.
		 * isEqual()�޼ҵ�� test()�Ű����� sourceObject�� isEqual()�� �Ű����� targetObject�� java.util.ObjectsŬ������
		 * Equals() �Ű������� �����ϰ�, java.util.Objects.equals(sourceObject, targetObject)�� ���ϰ��� ��� ���ο� Predicate<T>�� �����Ѵ�.
		 */
		//�� ���ڿ��� ���ϱ� ���ؼ� Predicate�� isEqual() ���� �޼ҵ带 ����Ѵ�.
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));

		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: " + predicate.test("Java7"));
	}

}
