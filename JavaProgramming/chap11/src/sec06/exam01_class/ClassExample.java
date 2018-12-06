package sec06.exam01_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassExample {

	// �ڹٴ� Ŭ������ �������̽��� ��Ÿ ������(Ŭ������ �̸�, ������ ����, �ʵ� ����, �޼ҵ� ����)��
	// java.lang.Class Ŭ������ �����Ѵ�.
	// Class ��ü ���(getClass(), forName())
	public static void main(String[] args) {
		Car car = new Car("�׷���");

		// getClass()�޼ҵ�� �ش� Ŭ������ ��ü�� �������� ��쿡�� ����� �� �ִ�.
		Class<? extends Car> cls = car.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		System.out.println();

		try {
			// forName()�޼ҵ�� ��ü�� �����ϱ� ���� ���� Class��ü�� ���� �� �ִ�.
			// Class�� �����ڸ� ���߰� �ֱ� ������ new �����ڷ� ��ü�� ���� �� ����, ���� �޼ҵ��� forName()�� �̿��ؾ� �Ѵ�.
			// forName()�޼ҵ�� Ŭ���� ��ü �̸�(��Ű���� ���Ե� �̸�)�� �Ű������� �ް� Class ��ü�� �����Ѵ�.
			// Class.forName()�޼ҵ�� �Ű������� �־��� Ŭ������ ã�� ���ϸ� ClassNotFoundException���ܸ� �߻���Ű�� ������
			// ���� ó���� �ʿ��ϴ�.
			Class<?> cls2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
			System.out.println();
			
			//���� ��ü ����(newInstance())
			Constructor<?> constructor = null;
			Class<?>[] constructorParameterTypes = { String.class, String.class };
			constructor = cls2.getConstructor(constructorParameterTypes);
		
			Car car2 = (Car) constructor.newInstance("�����ڵ���", "�ҳ�Ÿ");
			System.out.println(car2.getCompany() + ", " + car2.getModel());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(InvocationTargetException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
