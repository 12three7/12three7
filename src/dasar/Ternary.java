package dasar;

public class Ternary {
	
	public static void main(String[] args) {
		/**
		 * ternary operator.
		 * kalo hasilnya true, data pertama yang diambil.
		 * kalo hasilnya false, data kedua yang diambil.
		 * berguna buat mengembalikan data yang berbeda tergantung kondisi.
		 */
		// tanpa ternary
		int a = 1;
		String b;
		if(a >= 1){
			b = "ok";
		} else {
			b = "ko";
		}
		System.out.println(b);
		
		// dengan ternary
		String c = a >= 1 ? "ok" : "ko";
		System.out.println(c);
	}
	
}
