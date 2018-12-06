package sec06.exam03_newinstance;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			/*
			 * ���� ��ü ����(newInstance()) Class��ü�� �̿��ϸ� new �����ڸ� ������� �ʾƵ� �������� ��ü�� ������ �� �ִ�. ��
			 * ����� �ڵ� �ۼ� �ÿ� Ŭ���� �̸��� ������ �� ����, ��Ÿ�� �ÿ� Ŭ���� �̸��� �����Ǵ� ��쿡 �ſ� �����ϴ�.
			 * Class.forName()�޼ҵ�� Class��ü�� ���� ���� newInstance()�޼ҵ带 ȣ���ϸ� ObjectŸ���� ��ü�� ���� ��
			 * �ִ�.
			 */

			// Class<?> cls = Class.forName("sec06.exam03_newinstance.SendAction");
			Class<?> cls = Class.forName("sec06.exam03_newinstance.ReceiveAction");

			/*
			 * newInstance()�޼ҵ�� �⺻ �����ڸ� ȿ���ؼ� ��ü�� �����ϱ� ������ �ݵ�� Ŭ������ �⺻ �����ڰ� �����ؾ� �Ѵ�.
			 * newInstance()�޼ҵ�� �� ���� ���ܰ� �߻��� �� �ִµ�, InstantiationException ���ܴ� �ش� Ŭ������ �߻�
			 * Ŭ�����̰ų� �������̽��� ��쿡 �߻��ϰ�, IllegalAccessException ���ܴ� Ŭ������ �����ڰ� ���� �����ڷ� ���� ������ ��
			 * ���� ��쿡 �߻��Ѵ�. newInstance()�޼ҵ��� ���� Ÿ���� Object�̹Ƿ� �̰��� ���� Ŭ���� Ÿ������ ��ȯ�ؾ߸� �޼ҵ带
			 * ����� �� �ִ�. �׷��� �ϱ� ���ؼ��� ���� Ÿ�� ��ȯ�� �ؾ� �ϴµ�, Ŭ���� Ÿ���� �𸣴� �����̹Ƿ� ��ȯ�� �� �� ����. �� ������
			 * �ذ��Ϸ��� �������̽� ����� �ʿ��ϴ�.
			 */
			Action action = (Action) cls.newInstance();
			action.execute();

			/*
			 * newInstance()�޼ҵ�� �Ű� ������ �ִ� �����ڸ� ȣ���ϰ� �ʹٸ� ���÷��������� Constructor ��ü�� ���
			 * newInstance()�޼ҵ带 ȣ���Ѵ�.
			 */
//			Class<?> cls = Class.forName("sec06.exam03_newinstance.SendAction");
//
//			Class<?>[] constructorParameterTypes = { String.class };
//			Constructor<?> constructor = cls.getConstructor(constructorParameterTypes);
//			Action action = (Action) constructor.newInstance("�۽�");
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
