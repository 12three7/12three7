package dasar;

public class If {
	
	public static void main(String[] args) {
		//ini if statement
		int a = 69;
		 if(a == 69){
			System.out.println("nice");
		}
		// ini if else statement
		a = 5;
		if(a == 5){
			System.out.println("hello world");
		} else {
			System.out.println("halo dunia");
		}
		// ini if else statement bertingkat.
		// tentu aja lu bisa bikin tingkatan if statement sebanyak banyaknya.
		a = 10;
		if(a == 2){
			System.out.println("aaaaa");
		} else if(a == 5){
			System.out.println("bbbbb");
		} else if(a == 10){
			System.out.println("ccccc");
		} else {
			System.out.println("ohno");
		}
	}
	
}
