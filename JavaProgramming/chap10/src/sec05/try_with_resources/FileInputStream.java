package sec05.try_with_resources;

//try-with-resources를  사용하기 위해서는 조건이 있는데, 리소스 객체는 
//java.lang.AutoCloseable 인터페이스를 구현하고 있어야 한다.
public class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}

}
