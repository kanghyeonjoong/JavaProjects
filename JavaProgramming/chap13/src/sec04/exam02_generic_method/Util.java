package sec04.exam02_generic_method;

public class Util {
	//정적 메소드 선언
	//타입 파라미터는 K와 V로 선언되었는데, 제네릭 타입 Pair가 K와 V를 가지고 있기 때문이다.
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare=p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
