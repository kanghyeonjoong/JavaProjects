package sec03.exam03_tostring;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//ObjectŬ������ toString()�޼ҵ�� ��ü�� ���� ����(��ü�� ���ڿ��� ǥ���� ��)�� �����Ѵ�.
		//Object�� ���� Ŭ�������� toString()�޼ҵ带 �������Ͽ� �����ϰ� ������ ������ �����ϵ��� �Ǿ� �ִ�.
		//java.util��Ű���� DateŬ������ toString()�޼ҵ带 �������Ͽ� ���� �ý����� ��¥�� �ð� ������ �����Ѵ�.
		//StringŬ������ toString()�޼ҵ带 �������ؼ� �����ϰ� �ִ� ���ڿ��� �����Ѵ�.
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
