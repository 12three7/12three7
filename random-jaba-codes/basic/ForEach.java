package dasar;

public class ForEach {
	
	public static void main(String[] args) {
		/**
		 * anggap aja ini versi simple dari for loop.
		 * berguna buat minta data dari array, karena dalam kasus ini pake for each lebih gampang dari pada for loop biasa
		 */
		int[] n = {1,2,3,4,5,6,7,8,9};
		
		// for loop biasa
		for(int i = 0;i < n.length;i++){
			System.out.println(n[i]);
		} //.....
		
		// for each
		for(var j : n){
			System.out.println(n[j]);
		}
	}
	
}
