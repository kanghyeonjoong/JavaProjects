package sec04.exam02_super;

public class SupersonicAirPlaneExample {
	public static void main(String[] args) {
		SupersonicAirPlane sa = new SupersonicAirPlane();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}
}
