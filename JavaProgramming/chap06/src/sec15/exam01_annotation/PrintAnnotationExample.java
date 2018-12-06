package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// Service Ŭ�����κ��� �޼ҵ� ������ ����
		Method[] declareMethods = Service.class.getDeclaredMethods();

		for (Method method : declareMethods) {
			// PrintAnnotation�� ����Ǿ����� Ȯ��
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// �޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");

				// ���м����
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					//Service ��ü�� �����ϰ� ������ Service��ü�� �޼ҵ带 ȣ���ϴ� �ڵ�
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
