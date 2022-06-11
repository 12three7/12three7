package oop.classes.abstr;

public abstract class ContohAbstractClass {
        /*
          class mentahan. cuma untuk diturunkan/di inherit.
         */
        public ContohAbstractClass(String name){
                this.name = name;
        }

        String name;

        public int getN() {
                return n;
        }

        public void setN(int n) {
                this.n = n;
        }

        private int n = 93164839;

        public void hello(){
                System.out.println("hello " + name);
        }

        public abstract String toString();
        public abstract void doStuff();
}
