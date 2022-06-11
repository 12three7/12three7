package classes;
import static java.lang.System.out;
import static java.util.UUID.*; // sengaja di import static biar pendek
public class UUIDClass {
	
	public static void main(String[] args) {
		out.println(randomUUID());
		// print 100 uuid
		for(int i = 0; i < 100;i++){
			out.println(randomUUID());
		}
	}
	
}
