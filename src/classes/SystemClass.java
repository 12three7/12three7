package classes;

public class SystemClass {
        public static void main(String[] args) {
                System.out.println();
                System.out.println(System.currentTimeMillis()); // print milisecond sekarang
                System.out.println(System.nanoTime()); // print nanosecond sekarang
                System.out.println(System.getenv()); // print semua env variable di device sekarang
                System.gc(); // garbage collection
                System.exit(0); // exit , menghentikan program. kode dibawahnya gak dijalankan karena jvm nya berhenti
                System.out.println("Hello World"); // unreachable
        }
}
