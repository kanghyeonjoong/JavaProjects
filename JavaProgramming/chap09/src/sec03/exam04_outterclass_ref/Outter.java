package sec03.exam04_outterclass_ref;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field="Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			//중첩 객체 참조
			System.out.println(this.field);
			this.method();
			
			//중첩 클래스 내부에서 바깥 클래스의 객체 참조를 얻으려면 바깥 클래스의 이름을 this앞에 붙여준다.
			//바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
