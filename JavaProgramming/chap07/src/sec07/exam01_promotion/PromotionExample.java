package sec07.exam01_promotion;

class A {
}

class B extends A {

}

class C extends A {

}

class D extends B {

}

class E extends C {

}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		//�ڵ� Ÿ�� ��ȯ(Promotion)�� ���α׷� ���� ���߿�  �ڵ������� Ÿ�� ��ȯ�� �Ͼ�� ���� ���Ѵ�.
		//�θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ���Ŀ��� �θ� Ŭ������ ����� �ʵ�� �޼ҵ常 ������ �����ϴ�.
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
/*		B b2 = e;
		C c2 = d;
		*/
	}
}
