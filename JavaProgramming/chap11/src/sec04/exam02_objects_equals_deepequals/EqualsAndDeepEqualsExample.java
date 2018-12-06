package sec04.exam02_objects_equals_deepequals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		//Objects.equals(Object a, Object b), Objects.deepEquals(Object a, Object b)는 두 객체의 동등을 비교한다.
		//Objects.equals(Object a, Object b)는 두 객체의 얕은 비교(번지만 비교)
		//Objects.deepEquals(Object a, Object b)는 두 객체의 깉은 비교(배열의 항목까지 비교)
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2) + "\n");

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
