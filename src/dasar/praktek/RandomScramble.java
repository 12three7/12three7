package dasar.praktek;

import java.util.Random;
import java.util.Scanner;

public class RandomScramble {
        public static void main(String[] args) {
                char[][] notations = {
                        {'R', 'L', 'F', 'B', 'U', 'D', 'M', 'E', 'S', 'X', 'Y', 'Z'},
                        {' ', '2', '\'', 'w'}
                };

                Scanner s = new Scanner(System.in);
                System.out.print("mode: ");
                int mode = s.nextInt();
                switch(mode){
                        case 1:
                                System.out.println("ok. mode 1.");
                                Random r = new Random();
                                int scr = r.nextInt(16);
                                for(int i = 0;i < scr;i++){
                                        int nota = r.nextInt(6);
                                        int nota2 = r.nextInt(3);
                                        System.out.print(notations[0][nota]);
                                        System.out.print(notations[nota2] + " ");
                                }
                                break;
                        case 2:
                                System.out.println("ok. mode 2.");
                                Random r2 = new Random();
                                int scr2 = r2.nextInt(22);
                                for(int i = 0;i < scr2;i++){
                                        int nota = r2.nextInt(9);
                                        int nota2 = r2.nextInt(4);
                                        System.out.print(notations[0][nota]);
                                        System.out.print(notations[1][nota2] + " ");
                                }
                                break;
                        case 3:
                                System.out.println("ok. mode 3.");
                                Random r3 = new Random();
                                int scr3 = r3.nextInt(35);
                                for(int i = 0;i < scr3;i++){
                                        int nota = r3.nextInt(12);
                                        int nota2 = r3.nextInt(4);
                                        System.out.print(notations[0][nota]);
                                        System.out.print(notations[1][nota2] + " ");
                                }
                                break;
                        default:
                                System.out.println("error!");
                }
        }
}
