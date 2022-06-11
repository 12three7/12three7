package classes;

import java.util.Locale;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringClass {
        public static void main(String[] args) {
                String a = "Anjay, Mantap";
                System.out.println(a.toLowerCase()); // anjay, mantap
                System.out.println(a.toUpperCase()); // ANJAY, MANTAP
                System.out.println(a.length()); // 13
                System.out.println(a.startsWith("A")); // true
                System.out.println(a.endsWith("x")); // false
                String[] strings = a.split(", ");
                for(int i = 0;i < strings.length;i++){
                        System.out.println(strings[i]);
                        /* Anjay
                         * Mantap
                         */
                }
                StringBuilder b = new StringBuilder(); // buat manimpulasi string
                b.append("Hello ");
                b.append("world!");
                System.out.println(b.toString());
                StringBuffer c = new StringBuffer(); // sama aja, tapi thread safe, dan lebih slow.
                c.append("Halo ");
                c.append("dunia!");
                System.out.println(c.toString());
                String[] strings1 = {"Hello", "World!"};
                StringJoiner stringJoiner = new StringJoiner(", ", "\"", "\"");
                for(String i : strings1){
                        stringJoiner.add(i);
                }
                System.out.println(stringJoiner);
                String var2 = "this is a string aaaaaaaaaaaaaaa";
                StringTokenizer token = new StringTokenizer(var2, " ");
                while (token.hasMoreTokens()){
                        String t = token.nextToken();
                        System.out.println(t);
                }

        }
}
