package verify.exam05;

public class Anonymous {
	//익명 구현 객체를 필드에 대입
	Vehicle field=new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	//로컬 변수에 익명 구현 객체를 대입
	void method1() {
		Vehicle localVar=new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run();
	}
	
	//매개값에 익명 구현 객체를 대입
	void method2(Vehicle v) {
		v.run();
	}
}
