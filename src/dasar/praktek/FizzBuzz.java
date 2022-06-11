package dasar.praktek;

public class FizzBuzz {
	public static void fizzBuzz(int n){
		for(int i = 1;i <= n;i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0){
				System.out.println("Fizz");
			} else if(i % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	static int j = 0;
	public static void fizzBuzz2(){
		j++;
		if(j <= 100){
			if(j % 3 == 0 && j % 5 == 0){
				System.out.println("FizzBuzz");
			} else if(j % 3 == 0){
				System.out.println("Fizz");
			} else if(j % 5 == 0){
				System.out.println("Buzz");
			} else {
				System.out.println(j);
			}
		fizzBuzz2();
		}
	}	
	public static void main(String[] args) {
		fizzBuzz(100); // for loop
		fizzBuzz2(); // recursive method
	}
}
