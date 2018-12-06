package sec15.exam01_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		/*
		 * java.text.Format클래스는 형식을 나타내기 위한 클래스(추상클래스)이다.
		 * 숫자를 위해 DecimalFormat, 날짜 형식을 위해 SimpleDateFormat, 매개 변수화된 문자열을 위해 MessageFormat 등을 제공한다.
		 */

		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));

		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));

		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df=new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
		
		//%는 100을 곱한 후에 %문자를 붙임
		df=new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		System.out.println();
		
		df = new DecimalFormat("\u20AC #,###");//유로
		System.out.println(df.format(num));
		df = new DecimalFormat("EUR #,###");//유로
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\u00A4 #,###");//원화
		System.out.println(df.format(num));
		df = new DecimalFormat("KRW #,###");//원화
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\uFFE5 #,###");//엔화
		System.out.println(df.format(num));
		df = new DecimalFormat("JPY #,###");//엔화
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\u0024 #,###");//달러
		System.out.println(df.format(num));
		df = new DecimalFormat("USD #,###");//달러
		System.out.println(df.format(num));

	}

}
