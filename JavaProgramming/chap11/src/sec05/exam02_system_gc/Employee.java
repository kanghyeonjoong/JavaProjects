package sec05.exam02_system_gc;

public class Employee {
	private int eno;

	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")가 메모리에 생성됨");
	}
	
	public int getEno() {
		return eno;
	}

	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ")가 메모리에서 제거됨");
	}
}
