package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) {
		try {
			// Class ��ü�� �̿��ϸ� Ŭ������ ������, �ʵ�, �޼ҵ� ������ �˾Ƴ� �� �ִ�.
			// �̰��� ���÷���(Reflection:Ŭ������ ������ �м��� ���� ���α׷� ���)�̶�� �Ѵ�.
			// Class ��ü�� ���÷����� ���� getDeclaredConstructors(), getDeclaredFields(),
			// getDeclaredMethods()�� �����Ѵ�.
			// Constructor, Field, Method Ŭ������ ��� java.lang.reflect��Ű���� �ҼӵǾ� �ִ�.
			// getDeclaredFields(), getDeclaredMethods()�� Ŭ������ ����� ����� �������� ��ӵ� ����� ��������
			// �ʴ´�.
			// ��ӵ� ����� ��� �ʹٸ� getFields(), getMethods()�� �̿��ؾ� �Ѵ�.
			Class<?> cls = Class.forName("sec06.exam02_reflection.Car");

			System.out.println("[Ŭ���� �̸�]");
			System.out.println(cls.getName());
			System.out.println();

			System.out.println("[������ ����]");
			Constructor<?>[] constructors = cls.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.print(constructor.getName() + "(");
				Class<?>[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();

			System.out.println("[�ʵ� ����]");
			Field[] fields = cls.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();

			System.out.println("[�޼ҵ� ����]");
			Method[] methods = cls.getDeclaredMethods();
			for (Method method : methods) {
				System.out.print(method.getName() + "(");
				Class<?>[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printParameters(Class<?>[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < parameters.length - 1) {
				System.out.print(",");
			}
		}
	}
}
