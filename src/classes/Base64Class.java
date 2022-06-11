package classes;
import static java.lang.System.*;
import java.util.Base64;
public class Base64Class {
	
	public static void main(String[] args) {
		String n = "Hello World";
		String e = Base64.getEncoder().encodeToString(n.getBytes());
		out.println(e);
		byte[] b = Base64.getDecoder().decode(e);
		String r = new String(b);
		out.print(r);
	}
}
