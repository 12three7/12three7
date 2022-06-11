package oop.app;

import oop.classes.ContohClassLagi;
import oop.classes.ContohClassLagiLagi;
import oop.classes.ContohClass;
import oop.classes.abstr.TurunanAbstractClass;
import oop.enums.E;

public class ObjectCreation {
        public static void main(String[] args) {

                ContohClass contohObject = new ContohClass("hmmmmm");
                contohObject.helloIndonesia();
                contohObject.helloEnglish();
                contohObject.helloEnglish("....");
                System.out.println(contohObject);

                ContohClassLagi contohObjectLagi = new ContohClassLagi("1237");
                ContohClass contohObjectLagiLagiLagi = new ContohClassLagi("ohno");
                contohObjectLagiLagiLagi = (ContohClass) contohObject;
                contohObjectLagiLagiLagi.helloEnglish("1237");

                var var100000 = new ContohClassLagiLagi("a", "b", "c", "d");

                var var208479123 = new TurunanAbstractClass("anjay");
                System.out.println(var208479123.getN());
                var208479123.setN(1237);
                System.out.println(var208479123.getN());
                ContohClass l = new ContohClass("khafbkwdfh", E.F); 
        }
}
