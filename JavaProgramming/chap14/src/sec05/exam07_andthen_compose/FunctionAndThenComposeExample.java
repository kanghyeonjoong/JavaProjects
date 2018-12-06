package sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		/*
		 * andThen()�� compose() ����Ʈ �޼ҵ�
		 * Consumer, Function, Operator ������ �Լ��� �������̽��� andThen()�� compose() ����Ʈ �޼ҵ带 ������ �ִ�.
		 */
		
		//andThen()�޼ҵ带 ȣ���� �Լ��� �������̽��� functionA�̴�.
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);

		//compose()�޼ҵ带 ȣ���� �Լ��� �������̽��� functionB�̴�.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
	}

}
