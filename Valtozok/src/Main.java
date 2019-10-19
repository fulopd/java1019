
public class Main {

	public static void main(String[] args) {

		// Integer ii = new Integer(3); // kezdoerteke 3
		// String s = new String("123"); // kezdoerteke "123"
		// Integer ij = new Integer(s); // kezdoerteke: 123
		// Character cd = new Character('a'); // kezdoerteke: a

		//int i = Integer.parseInt("123");
		//int args1 = Integer.parseInt(args[0]);
		//Integer ii = new Integer(100);

		//float f = ii.floatValue();
		//int ez = ii.intValue();
		
		Integer szam = new Integer(1);
		Integer szam2 = new Integer(8);
		Integer szam3 = new Integer(8);
		
		boolean b = szam.equals(szam2);
		System.out.println(b);
		
		boolean b1 = szam2.equals(szam3);
		System.out.println(b1);
		
		int i = szam.compareTo(szam2);
		System.out.println(i);
		
		
		double pi = Math.PI;
		double e = Math.E;
		
		System.out.println(pi);
		System.out.println(e);
		
		
		
		
		
	}

}
