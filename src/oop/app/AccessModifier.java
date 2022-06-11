package oop.app;

public class AccessModifier {
        public int n = 5;
        protected int o = 6;
        int p = 7;
        private int q = 8;

        protected class ProtectedClass {
        }

        class NoModifierClass {
        }

        private class PrivateClass {
        }

        public void hello(){
                System.out.println("HELLO!!!11!1!1!11!");
        }

        protected void hello2(){
                System.out.println("HELLO!!!11!1!1!11!");
        }

        void hello3(){
                System.out.println("HELLO!!!11!1!1!11!");
        }

        private void hello4(){
                System.out.println("HELLO!!!11!1!1!11!");
        }
}
