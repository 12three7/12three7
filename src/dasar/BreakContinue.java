package dasar;

public class BreakContinue {
	
	public static void main(String[] args) {
		/**
		 * break = perulangan berhenti total.
		 * continue = perulangan yang sekarang gak dilakukan, skip ke perulangan berikutnya.
		 */
		
		// contoh penggunaan break dan continue

		for(int i = 0;i < 100;i++){
			System.out.println("hello world");
			if(i % 2 == 0){
				continue; // bilangan genap di skip, yang keluar cuma bilangan ganjil
			}
			
			if(i == 50){
				break; // perulangan berhenti total kalo i == 50.
			}
		}
	}
	
}
