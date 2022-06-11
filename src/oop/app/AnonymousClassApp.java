package oop.app;

import oop.classes.Anonymous;
import oop.classes.ContohClass;

/**
 * class tanpa nama.
 */
public class AnonymousClassApp {
        Anonymous an = new Anonymous("an"){{
              anonymousObject = new ContohClass("class?");
        }};

}
