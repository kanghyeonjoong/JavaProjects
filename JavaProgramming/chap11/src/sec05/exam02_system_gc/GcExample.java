package sec05.exam02_system_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;

		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);

		System.out.print("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.getEno());

		// JVM은 메모리가 부족할 때와 CPU가 한가할 때에 쓰레기 수집기(Garbage Collector)를 실행시켜
		// 사용하지 않은 객체를 자동 제거한다.
		// System.gc()메소드가 호출되면 쓰레기 수집기가 바로 실행되는 것은 아니고, JVM은 빠른 시간 내에
		// 실행시키기 위해 노력한다.
		System.gc();// 쓰레기 수집기 실행 요청
	}

}
