package dasar;

public class Array {
	public static void main (String[] args){
		/**
		 * anggap aja variable tapi isinya bisa > 1.
		 * berguna kalo mau nyimpen banyak data dalam 1 variabel.
		 */
		// ada orang yang bikin array kayak begini.
		String [] contoh = new String[2];
		contoh[0] = "hello world";
		contoh[1] = "halo dunia";
		contoh[2] = " ";
		
		// ada juga yang kayak begini.
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		String[] iniArray = {"ini", "array"};
		String iniBukanArray = "a";
		
		/**
		 * setiap data di array punya indexnya sendiri.
		 * index array dimulai dari angka 0 sampai ukuran array - 1.
		 * jadi kalo lu punya array isinya 10, indexnya mulai dari angka 0 sampai 9.
		 * begini caranya minta data dari array:
		 */
		System.out.println(array[0]); // 1
		System.out.println(contoh[1]); // halo dunia

		/**
		 * lu juga bisa bikin multi dimensional array, kayak begini:
		 */
		int[][] multi = {
			{1,2,3,4,5},
			{10,20,30,40,50},
			{100,200,300,400,500}
		};
		/**
		 * dan begini cara minta data nya:
		 * array[baris][kolom]
		 */
		System.out.println(multi[0]/* baris 0 */[3]/* kolom 3 */); // 4
		
	}
}
