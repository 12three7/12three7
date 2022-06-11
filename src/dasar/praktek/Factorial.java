package dasar.praktek;

public class Factorial {
	static int factorial(int n){
		if(n <= 0){
			return 1;
		}
		int r = 1;
		for(int i = n; i >= 1;i--){
			r *= i;
		}
		return r;
	}
	
	static int factorialRecursive(int n){
		if(n <= 0){
			return 1;
		} else {
			n *= factorialRecursive(n - 1);
		}
		return n;
	}
	
	static int factorialTailRecursive(int t, int n){
		if(n <= 1){
			return t;
		} else {
			return factorialTailRecursive(t * n, n - 1);
		}
	}
	
	public static void main(String[] args){
		System.out.println(factorial(6)); // 720
		System.out.println(factorialRecursive(5)); // 120
		System.out.println(factorialTailRecursive(1, 3)); // 6
	}
}
