package sec08.exam04_method_overloading;

public class Calculator {
	// �޼ҵ�
	// ���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}

	// ���簢���� ����
	//�޼ҵ� �����ε��� ������ �Ű� ������ Ÿ��, ����, ���� �� �ϳ��� �޶�� �Ѵ�.
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
