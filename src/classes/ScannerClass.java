package classes;

import java.util.Scanner;

public class ScannerClass {
        public static void main(String[] args) {
                Scanner a = new Scanner(System.in);
                System.out.print("Enter your username: ");
                String user = a.nextLine();

                Scanner b = new Scanner(System.in);
                System.out.print("Enter your password: ");
                String pass = b.nextLine();
                System.out.println("OK!\nUsername: " + user + "\nPassword: " + pass);
        }
}
