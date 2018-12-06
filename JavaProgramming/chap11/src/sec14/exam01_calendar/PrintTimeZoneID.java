package sec14.exam01_calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDS = TimeZone.getAvailableIDs();
		for (String id : availableIDS) {
			System.out.println(id);
		}
	}

}
