package oop.app;

public class TryCatch {
        public static void main(String[] args) {
                System.out.println("hello");
                try {
                        Thread.sleep(6000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                } finally {
                        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                }
                System.out.println("world");
        }
}
