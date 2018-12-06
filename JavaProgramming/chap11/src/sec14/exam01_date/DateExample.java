package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		/*
		 * java.util.Date Ŭ����
		 * Date()Ŭ������ ��ǻ���� ���� ��¥�� �о� Date��ü�� �����.
		 */
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		/* java.text.SimpleDateFormatŬ������ �̿��� Ư�� ���ڿ� ������ ����Ѵ�. */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}
