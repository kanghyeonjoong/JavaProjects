package sec05.exam01_bounded_type_parameter;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//int result1=Util.compare("a", "b");

		int result2 = Util.compare(10, 20);//int->Integer�� �ڵ�Boxing
		System.out.println(result2);

		int result3 = Util.compare(4.5, 3);//double->Double�� �ڵ�Boxing
		System.out.println(result3);
	}

}
