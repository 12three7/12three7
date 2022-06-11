package classes;
import static java.lang.System.out;
import java.lang.*;
public class RuntimeClass {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		out.println(r.availableProcessors());
		out.println(r.freeMemory());
		out.println(r.totalMemory());
		out.println(r.maxMemory()); 
		r.gc();
	}
}
