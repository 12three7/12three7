package dasar;

public class OperasiBoolean {
	
	public static void main(String[] args) {
		/**
		 * not gate, and gate, dan or gate. outputnya bisa true atau false.
		 */
		boolean e = false;
		boolean f = true;
		System.out.println(e || f); // or -- salah satunya true = true -- outputnya true
		System.out.println(e && f); // and -- dua duanya true = true -- outputnya false
		System.out.println(!e); // not -- true jadi false, false jadi true -- berguna buat meng""ingkar""kan statement. -- outputnya true
	}
	
}
