package sec04.exam02_generic_method;

public class Util {
	//���� �޼ҵ� ����
	//Ÿ�� �Ķ���ʹ� K�� V�� ����Ǿ��µ�, ���׸� Ÿ�� Pair�� K�� V�� ������ �ֱ� �����̴�.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare=p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
