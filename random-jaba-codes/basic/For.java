package dasar;

public class For {
	
	public static void main(String[] args) {
		/**
		 * kata kunci untuk membuat perulangan.
		 * syntax:
		 * for(init statement;kondisi;post statement){
		 * 		// kode
		 * }
		 * init statement = kode yang akan dijalankan sekali sebelum perulangan dimulai -- biasanya dipake buat deklarasi variabel.
		 * kondisi = boolean expression, kalo true loopnya bakal jalan.
		 * post statement = kode yang akan dijalankan setiap akhir perulangan. kalo kode didalam blocknya udah jalan sampe paling bawah, post statementnya bakal jalan, dan kondisi di cek lagi.
		 */
		
		// lu bisa bikin semuanya kosong. ini bakal ngeloop terus sampai lu matiin program lu.
		/*
		
		for(;;){
			System.out.println("ohno");
		} 
		
		*/ 
		// sengaja gw jadiin comment biar kodenya gak jalan
		
		// loop dengan kondisi
		for(int i = 0;i < 10;){
			System.out.println("hm");
		}
		
		// loop lengkap. ada init, ada kondisi, dan ada post
		for(int j = 0;j < 100;j++){
			System.out.println("anjay mantab");
		}
	}
	
}
