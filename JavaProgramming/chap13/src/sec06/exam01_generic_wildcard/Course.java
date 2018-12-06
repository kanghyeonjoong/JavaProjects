package sec06.exam01_generic_wildcard;

//제네릭 타입 Course : 타입을 파라미터로 가지는 클래스와 인터페이스
public class Course<T> {
	String name;//과정명
	private T[] students;//수강생을 저장하는 타입 파라미터 배열

	public Course(String name, int capacity) {
		this.name = name;
		//타입 파라미터로 배열을 생성하려면 new T[n]형태로 배열을 생성할 수 없고
		//(T[]) (new Object[n])으로 생성해야 한다.
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	//배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
