package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// Service 클래스로부터 메소드 정보를 얻음
		Method[] declareMethods = Service.class.getDeclaredMethods();

		for (Method method : declareMethods) {
			// PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");

				// 구분선출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					//Service 객체를 생성하고 생성된 Service객체의 메소드를 호출하는 코드
					method.invoke(new Service());
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
