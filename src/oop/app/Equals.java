package oop.app;

public class Equals {
        public static void main(String[] args) {
                String a = "Hello ";
                a += "World";
                String b = "Hello World";
                System.out.println(a.equals(b)); // true
                System.out.println(a == b); // false
        }
}
