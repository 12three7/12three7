package oop.app;

import oop.errors.ContohException;

public class FactorialError {
        static int factorial(int n) throws ContohException {
                if(n <= -666) throw new ContohException("bejir");
                if(n <= 0) return 1;
                int r = 1;
                for(int i = n; i >= 1;i--){
                        r *= i;
                }
                return r;
        }

        public static void main(String[] args) throws ContohException {
                System.out.println(factorial(-10000));
                System.out.println(factorial(6));
        }
}
