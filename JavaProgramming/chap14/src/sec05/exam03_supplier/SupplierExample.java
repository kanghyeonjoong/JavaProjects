package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		/*
		 * Supplier �Լ��� �������̽��� Ư¡�� �Ű� ������ ���� ���ϰ��� �ִ� getXXX()�޼ҵ带 ������.
		 * getXXX()�޼ҵ���� ȣ���� ������ �����͸� ����(����)�ϴ� ������ �Ѵ�.
		 * Supplier->���ϰ�
		 */
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};

		int num = intSupplier.getAsInt();
		System.out.println("���� ��: " + num);
	}

}
