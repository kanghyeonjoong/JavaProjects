package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) {
		try {
			// Class 객체를 이용하면 클래스의 생성자, 필드, 메소드 정보를 알아낼 수 있다.
			// 이것을 리플렉션(Reflection:클래스의 정보를 분석해 내는 프로그램 기법)이라고 한다.
			// Class 객체는 리플렉션을 위해 getDeclaredConstructors(), getDeclaredFields(),
			// getDeclaredMethods()를 제공한다.
			// Constructor, Field, Method 클래스는 모두 java.lang.reflect패키지에 소속되어 있다.
			// getDeclaredFields(), getDeclaredMethods()는 클래스에 선언된 멤버만 가져오고 상속된 멤버는 가져오지
			// 않는다.
			// 상속된 멤버도 얻고 싶다면 getFields(), getMethods()를 이용해야 한다.
			Class<?> cls = Class.forName("sec06.exam02_reflection.Car");

			System.out.println("[클래스 이름]");
			System.out.println(cls.getName());
			System.out.println();

			System.out.println("[생성자 정보]");
			Constructor<?>[] constructors = cls.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				System.out.print(constructor.getName() + "(");
				Class<?>[] parameters = constructor.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();

			System.out.println("[필드 정보]");
			Field[] fields = cls.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();

			System.out.println("[메소드 정보]");
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
