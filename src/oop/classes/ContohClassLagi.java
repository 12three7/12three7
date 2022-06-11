package oop.classes;

public class ContohClassLagi extends ContohClass{

        public ContohClassLagi(String name) {
                super(name);
        }

        public ContohClassLagi(String name, int loops) {
                for (int i = 0; i < loops; i++) {
                        System.out.println("Hello " + name);
                }
        }

        @Override
        public void helloEnglish() {
                System.out.println("Hello!!!!11!1!!1!!1");
                super.helloEnglish();
        }

        @Override
        public String toString() {
                return "ContohClassLagi{}";
        }
}
