package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		/* java.lang.Math 클래스는 모두 정적 메소드를 가진다. */
		//절대값
		System.out.println("[절대값]");
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println();

		//올림값
		System.out.println("[올림값]");
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println();

		//버림값
		System.out.println("[버림값]");
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5);
		System.out.println(v6);//-6.0
		System.out.println();

		//최대값
		System.out.println("최대값");
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println(v7);
		System.out.println(v8);
		System.out.println();

		//최소값
		System.out.println("최소값");
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println(v9);
		System.out.println(v10);
		System.out.println();

		//랜던값(난수 0.0 ~ 1.0(제외)사이의 값)
		System.out.println("랜던값");
		double v11=Math.random();
		System.out.println(v11);
		System.out.println();
		
		//가까운 정수의실수값
		System.out.println("가까운 정수의 실수값");
		double v12=Math.rint(5.3);
		double v13 =Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		System.out.println();
		
		//반올림
		System.out.println("반올림");
		long v14=Math.round(5.3);
		long v15=Math.round(5.7);
		System.out.println(v14);
		System.out.println(v15);
		System.out.println();
		
		//round()메소드는 항상 소수점 첫째 자리에서 반올림해서 정수값을 리턴한다,.
		double value=12.3456;
		double temp1=value*100;
		long temp2=Math.round(temp1);
		double  v16=temp2/100.0;
		System.out.println(v16);
		System.out.println();
				
	}

}
