package dasar;

public class Switch {
	
	public static void main(String[] args) {
		/**
		 * mirip if statement tapi lebih singkat. dan cuma bisa
		 * digunakan untuk perbandingan ==. 
		 */
		int a;
		a = 10; // ok
		switch(a){
			case 10:
				System.out.println("ok");
				break;
			case 20:
				System.out.println("bagus");
				break;
			case 35:
				System.out.println("anjay");
				break;
			default:
				System.out.println("ohno");
		}
	}
	
}
