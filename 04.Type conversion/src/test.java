
public class test {

	public static void main(String[] args) {
//      String --> int
		String a = "5";
		int b = Integer.valueOf(a);
		// int b = Integer.parseInt(a);
		System.out.println(b + 2);

//      int --> String
		int c = 21;
		String d = String.valueOf(c);
		System.out.println(d + 3);

//		double --> int
		double e = 12.34;
		int f = (int) e;
		System.out.println(f);

//		int --> double
		int g = 5;
		double h = (double) g;
		System.out.println(h);

//		float --> long
		float i = 5.12f;
		long j = (long) i;
		System.out.println(j);

//		long --> float
		long k = 123456;
		float l = (float) k;
		System.out.println(l);

//		long --> string
		long m = 123456;
		String n = String.valueOf(m);
		System.out.println(n + 7);

//		float --> string
		float o = 12.34F;
		String p = String.valueOf(o);
		System.out.println(p + 1);

//		byte --> string
		byte r = 127;
		String s = Byte.toString(r);
		System.out.println(s + 2);

	}

}
