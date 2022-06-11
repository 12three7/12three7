package oop.classes;

import oop.enums.E;

import java.util.Arrays;
import java.util.Objects;

public class ContohClass {
        public ContohClass(String name) {
                this.name = name;
        }
        public ContohClass(String... names){
                this.names = names;
        }
        public ContohClass(String name, E l) {
                this.name = name; this.l = l;
        }
        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                ContohClass that = (ContohClass) o;
                return Objects.equals(name, that.name) && Arrays.equals(names, that.names) && Objects.equals(hello, that.hello);
        }

        @Override
        public int hashCode() {
                int result = Objects.hash(name, hello);
                result = 31 * result + Arrays.hashCode(names);
                return result;
        }

        public void helloEnglish(){
                hello = "Hello!";
                System.out.println(hello);
        }

        public void helloEnglish(String name){
                hello = "Hello ";
                System.out.println(hello + name + "!");
        }

        public void helloIndonesia(){
                hello = "Halo!";
                System.out.println(hello);
        }

        public void helloIndonesia(String name){
                hello = "Halo ";
                System.out.println(hello + name + "!");
        }
        public E l;
        public String name;
        public String[] names;
        public String hello;
        @Override
        public String toString() {
                return "ContohClass{" +
                        "name='" + name + '\'' +
                        ", names=" + Arrays.toString(names) +
                        ", hello='" + hello + '\'' +
                        '}';
        }
}
