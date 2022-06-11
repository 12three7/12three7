package oop.classes;

import oop.interfaces.ContohInterface;

public class ContohClassLagiLagi extends ContohClass implements ContohInterface {

        public ContohClassLagiLagi(String name) {
                super(name);
        }

        public ContohClassLagiLagi(String... names) {
                super(names);
                for(int i = 0;i < names.length;i++){
                        System.out.println(names[i]);
                }
        }
}
