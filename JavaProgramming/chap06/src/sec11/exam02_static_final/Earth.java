package sec11.exam02_static_final;

//상수(static final) 필드는 객체마다 저장되지 않고, 클래스에만 포함된다.
public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
