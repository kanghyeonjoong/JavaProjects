package sec08.exam04_method_overloading;

public class Calculator {
	// 메소드
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	//메소드 오버로딩의 조건은 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다.
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
