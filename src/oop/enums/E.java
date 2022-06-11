package oop.enums;

public enum E {
        A("aaaaaaaaaaaaaaa"),B,C,D,E("eeeeeeeeeeeeeeeeeee"),F,G,H;

        String description;
        E(String desc){
                description = desc;
        }

        E(){}
}
