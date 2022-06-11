package oop.app;

import static oop.app.StaticFields.hm;
import static oop.app.StaticKeyword.*;
public class StaticKeyword {
        static int n = 10;
        static void ohno(){
                System.out.println("ohno");
        }
        public static class StaticClass {
                public static void main(String[] args) {
                        System.out.println("ini code didalam static class.");
                        System.out.println(hm);
                }
        }

        static {
                System.out.println("static block!");
        }
}
