package dasar;

public class Matematika {
	
	public static void main(String[] args) {
		/**
		 * ilmu yang mematikan.
		 */
		System.out.println(7 + 5); // tambah
		System.out.println(7 - 5); // kurang
		System.out.println(7 * 5); // kali
		System.out.println(7 / 5); // bagi
		System.out.println(7 % 5); // sisa bagi

		// ada juga augmented assignments, assign variable ke diri sendiri + <modifier>
		float a = 50;
		System.out.println(a);
		System.out.println(a += 1); // a = a + 1
		System.out.println(a -= 1); // a = a - 1
		System.out.println(a *= 999); // a = a * 999
		System.out.println(a /= 724692429); // a = a / 724692429
		System.out.println(a %= 6); // a = a % 6
		System.out.println(a++); // a += 1
		System.out.println(a--); // a -= 1
	}
	
}
