package oop.classes;

public final class ContohFinalClass {
        public ContohFinalClass() {
        }

        public final void contohFinalMethod(){
                System.out.println("ini final method.");
        }

        public class ContohInnerClass{
                public static void main(String[] args) {
                        System.out.println("kode dari inner class.");
                }
        }
}
