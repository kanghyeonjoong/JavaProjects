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

		//자동 타입 변환(Promotion)은 프로그램 실행 도중에  자동적으로 타입 변환이 일어나는 것을 말한다.
		//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
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
