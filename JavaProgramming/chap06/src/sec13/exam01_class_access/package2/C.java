package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.*;

public class C {
	//C클래스는 A클래스와 다른 패키지이므로 default로 접근이 제한된 A를래스에는 접근이 되지 않지만
	//public으로 공개된 B클래스는 접근이 가능하다.
	B b;
}
