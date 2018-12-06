package sec06.exam01_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassExample {

	// 자바는 클래스와 인터페이스의 메타 데이터(클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보)를
	// java.lang.Class 클래스로 관리한다.
	// Class 객체 얻기(getClass(), forName())
	public static void main(String[] args) {
		Car car = new Car("그랜저");

		// getClass()메소드는 해당 클래스로 객체를 생성했을 경우에만 사용할 수 있다.
		Class<? extends Car> cls = car.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		System.out.println();

		try {
			// forName()메소드는 객체를 생성하기 전에 직접 Class객체를 얻을 수 있다.
			// Class는 생성자를 감추고 있기 때문에 new 연산자로 객체를 만들 수 없고, 정적 메소드인 forName()을 이용해야 한다.
			// forName()메소드는 클래스 전체 이름(패키지가 포함된 이름)을 매개값으로 받고 Class 객체를 리턴한다.
			// Class.forName()메소드는 매개값으로 주어진 클래스를 찾지 못하면 ClassNotFoundException예외를 발생시키기 때문에
			// 예외 처리가 필요하다.
			Class<?> cls2 = Class.forName("sec06.exam01_class.Car");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
			System.out.println();
			
			//동적 객체 생성(newInstance())
			Constructor<?> constructor = null;
			Class<?>[] constructorParameterTypes = { String.class, String.class };
			constructor = cls2.getConstructor(constructorParameterTypes);
		
			Car car2 = (Car) constructor.newInstance("현대자동차", "소나타");
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
