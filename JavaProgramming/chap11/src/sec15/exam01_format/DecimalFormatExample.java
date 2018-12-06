package sec15.exam01_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		/*
		 * java.text.FormatŬ������ ������ ��Ÿ���� ���� Ŭ����(�߻�Ŭ����)�̴�.
		 * ���ڸ� ���� DecimalFormat, ��¥ ������ ���� SimpleDateFormat, �Ű� ����ȭ�� ���ڿ��� ���� MessageFormat ���� �����Ѵ�.
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
		
		//%�� 100�� ���� �Ŀ� %���ڸ� ����
		df=new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		
		System.out.println();
		
		df = new DecimalFormat("\u20AC #,###");//����
		System.out.println(df.format(num));
		df = new DecimalFormat("EUR #,###");//����
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\u00A4 #,###");//��ȭ
		System.out.println(df.format(num));
		df = new DecimalFormat("KRW #,###");//��ȭ
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\uFFE5 #,###");//��ȭ
		System.out.println(df.format(num));
		df = new DecimalFormat("JPY #,###");//��ȭ
		System.out.println(df.format(num));
		System.out.println();

		df = new DecimalFormat("\u0024 #,###");//�޷�
		System.out.println(df.format(num));
		df = new DecimalFormat("USD #,###");//�޷�
		System.out.println(df.format(num));

	}

}
