package dasar;

public class DoWhile {
	
	public static void main(String[] args) {
		/**
		 * anggap aja kebalikannya while.
		 * kodenya dijalankan dulu, baru kondisinya di cek.
		 * jadi kalo dari awal kondisinya udah salah, kodenya tetep jalan setidaknya sekali.
		 */
		
		/**
		 * syntax:
		 * do { // kode } while (kondisi);
		 */
		int a = 0;
		do {
			System.out.println("anjai");
			a++;
		} while (a <= 10);
	}
}
