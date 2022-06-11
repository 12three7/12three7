package oop.interfaces;

public interface ContohInterface {
        public default void hello(String name){
                System.out.println("");
        }

        public default void loop(String word, int count){
                for (int i = 0; i < count; i++) {
                        System.out.println(word);
                }
        }
}
