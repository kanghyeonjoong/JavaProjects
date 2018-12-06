package sec06.exam03_newinstance;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			/*
			 * 동적 객체 생성(newInstance()) Class객체를 이용하면 new 연산자를 사용하지 않아도 동적으로 객체를 생성할 수 있다. 이
			 * 방법은 코드 작성 시에 클래스 이름을 결정할 수 없고, 런타임 시에 클래스 이름이 결정되는 경우에 매우 유용하다.
			 * Class.forName()메소드로 Class객체를 얻은 다음 newInstance()메소드를 호출하면 Object타입의 객체를 얻을 수
			 * 있다.
			 */

			// Class<?> cls = Class.forName("sec06.exam03_newinstance.SendAction");
			Class<?> cls = Class.forName("sec06.exam03_newinstance.ReceiveAction");

			/*
			 * newInstance()메소드는 기본 생성자를 효출해서 객체를 생성하기 때문에 반드시 클래스에 기본 생성자가 존재해야 한다.
			 * newInstance()메소드는 두 가지 예외가 발생할 수 있는데, InstantiationException 예외는 해당 클래스가 추상
			 * 클래스이거나 인터페이스일 경우에 발생하고, IllegalAccessException 예외는 클래스나 생성자가 접근 제한자로 인해 접근할 수
			 * 없을 경우에 발생한다. newInstance()메소드의 리턴 타입은 Object이므로 이것을 원래 클래스 타입으로 변환해야만 메소드를
			 * 사용할 수 있다. 그렇게 하기 위해서는 강제 타입 변환을 해야 하는데, 클래스 타입을 모르는 상태이므로 변환을 할 수 없다. 이 문제를
			 * 해결하려면 인터페이스 사용이 필요하다.
			 */
			Action action = (Action) cls.newInstance();
			action.execute();

			/*
			 * newInstance()메소드로 매개 변수가 있는 생성자를 호출하고 싶다면 리플렉션을으로 Constructor 객체를 얻어
			 * newInstance()메소드를 호출한다.
			 */
//			Class<?> cls = Class.forName("sec06.exam03_newinstance.SendAction");
//
//			Class<?>[] constructorParameterTypes = { String.class };
//			Constructor<?> constructor = cls.getConstructor(constructorParameterTypes);
//			Action action = (Action) constructor.newInstance("송신");
//			System.out.println(((SendAction) action).getTitle());
//			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//		} catch (NoSuchMethodException | SecurityException e) {
//			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
		}
	}

}
