package sec13.exam02_field_method_access.package2;

import sec13.exam02_field_method_access.package1.A;

public class C {
	public C() {
		 A a=new A();
		 a.field1=1;
//		 a.field2=1; //default �ʵ� ���� �Ұ�
//		 a.field3=1;//private �ʵ� ���� �Ұ�
		 
		 a.method1();
//		 a.method2();//default �޼ҵ� ���� �Ұ�
//		 a.method3();//private �޼ҵ� ���� �Ұ�
	}
}