package sec05.exam02_system_gc;

public class Employee {
	private int eno;

	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ")�� �޸𸮿� ������");
	}
	
	public int getEno() {
		return eno;
	}

	// �Ҹ���
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + eno + ")�� �޸𸮿��� ���ŵ�");
	}
}
