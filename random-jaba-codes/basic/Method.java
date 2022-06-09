package dasar;

public class Method {
	
	public static void main(String[] args) {
		/**
		 * kumpulan kode yang hanya akan dijalankan saat dipanggil.
		 * syntax: void namaMethod(){ // kode }
		 * cara panggil: namaMethod();
		 * note: kalo lu mau manggil methodnya di dalam block public static void main(String[] args){}, tambah kata static sebelum void.
		 * kenapa? karena static cuma bisa manggil static.
		 */
		
		// panggil method disini
		hello();
		System.out.println("------------");
		concatenate("hello", "world");
		System.out.println("------------");
		mult(8, 6);
		System.out.println("------------");
		f(1,2,3,4,5,6,7,8);
		System.out.println("------------");
		hello("1237");
		System.out.println("------------");
	}
	// bikin method disini
	static void hello(){
		System.out.println("hello");
	}
	/**
	 * lu juga bisa ngirim/minta informasi/data sebelum methodnya dipanggil.
	 * caranya? tinggal tambah parameter ke methodnya.
	 * tentu aja lu bisa tambah parameter sebanyak-banyaknya.
	 * syntax: void namaMethod(parameter){ // kode }
	 * cara panggil: namaMethod(parameter);
	 */
	//TODO ganti contoh/tambah contoh lain
	static void concatenate(String word1, String word2){
		// gw kehabisan ide method
		System.out.println(word1 + " " + word2);
	}
	/*
	 * lu juga bisa bikin method yang mengembalikan data kalo dipanggil.
	 * syntax: type namaMethod(){
	 * 	// kode
	 * 	return data;
	 * }
	 * type = jenis data yang mau dikembalikan (misal: int, float, boolean, String, dll.). void = gak ngembaliin data.
	 * data = data yang mau dikembalikan
	 */
	// contoh:
	static int mult(int a, int b){
		return a * b;
	}
	/*
	 * lu juga bisa minta data array yang jumlahnya gak jelas (0 < x < infinity).
	 * caranya tinggal bikin variable argument di akhir parameternya.
	 * syntax:
	 * type namaMethod(type... namaArray){ // kode }
	 */
	
	// tanpa variable argument
	int[] m = {1,2,3,4,5,6,7,8};
	static void e(int[] n){
		for(int x = 0;x < n.length;x++){
			System.out.println(n[x]);
		}
	}
	// dengan variable argument (gak perlu bikin array, tinggal masukin array saat pemanggilan)
	static void f(int... n){
		for(int y = 0;y < n.length;y++){
			System.out.println(n[y]);
		}
	}
	/*
	 * lu juga bisa bikin method yang sama dengan parameter yang berbeda (overriding).
	 * ini berguna kalo lu pengen pengguna memasukkan parameter/data sesuai kebutuhan/keinginan.
	 */
	// misal: gw override method hello()
	static void hello(String name){
		System.out.println("Hello" + " " + name);
	}
	/*
	 * lu juga bisa bikin method yang memanggil dirinya sendiri.
	 * jangan keseringan bikin method kayak begini karena bahaya.
	 */
	static void no(){
		int a = 0;
		System.out.println(a);
		a++;
		no();
	}
}
