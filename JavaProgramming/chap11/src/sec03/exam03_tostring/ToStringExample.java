package sec03.exam03_tostring;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//Object클래스의 toString()메소드는 객체의 문자 정보(객체를 문자열로 표현한 값)를 리턴한다.
		//Object의 하위 클래스들은 toString()메소드를 재정의하여 간결하고 유익한 정보를 리턴하도록 되어 있다.
		//java.util패키지의 Date클래스는 toString()메소드를 재정의하여 현재 시스템의 날짜와 시간 정보를 리턴한다.
		//String클래스는 toString()메소드를 재정의해서 저장하고 있는 문자열을 리턴한다.
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
