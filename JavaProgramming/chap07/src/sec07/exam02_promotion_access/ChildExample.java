package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();

		Parent parent = child;// �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();//�����ǵ� �޼ҵ尡 ȣ��ȴ�.
		//parent.method3();
	}
}
