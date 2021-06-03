package day1.lab;

public class AutowidingNarrowing {

	public static void main(String[] args) {

		byte b = 10;

		short s = b;
		double d = methodOne(s);
		System.out.println(d);
		
		double b2 = 10.25;
		float f2 = (float) b2;
		short s2 = methodTwo((long)f2);

	}

	static float methodOne(int i) {
		long l = i;
		return l;
	}
	static short methodTwo(long l) {
		int i = (int) l;
		return (short) i;
	}
}
