package verify.exam05;

public class Anonymous {
	//�͸� ���� ��ü�� �ʵ忡 ����
	Vehicle field=new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
	};
	
	//���� ������ �͸� ���� ��ü�� ����
	void method1() {
		Vehicle localVar=new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		
		localVar.run();
	}
	
	//�Ű����� �͸� ���� ��ü�� ����
	void method2(Vehicle v) {
		v.run();
	}
}
