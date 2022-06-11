package dasar.praktek;

import java.util.Random;

public class RandomNoteMulti {
        public static void main(String[] args) {
                char[][] notes = {
                        {'c','d','e','f','g','a','b'},
                        {'#', '-', ' '},
                        {'1','2','3','4','5','6','7'}
                };
                Random rand = new Random();
                int bars = rand.nextInt(5);
                bars *= 16;
                if(bars == 0){
                        bars += 16;
                }
                for(int what = 0;what <= bars;what++){
                        int a = rand.nextInt(7);
                        int b = rand.nextInt(3);
                        int c = rand.nextInt(7);
                        int d = rand.nextInt(7);
                        int e = rand.nextInt(3);
                        int f = rand.nextInt(7);
                        String empty = "---";
                        if((a == 2 || a == 6 || d == 2 || d == 6) && b == 0 || e == 0){
                                continue;
                        } else if(b == 2){
                                System.out.print(empty + " ");
                                if(e == 2){
                                        System.out.println(empty);
                                } else {
                                        System.out.print(notes[0][d]);
                                        System.out.print(notes[1][e]);
                                        System.out.println(notes[2][f]);
                                }
                        } else {
                                System.out.print(notes[0][a]);
                                System.out.print(notes[1][b]);
                                System.out.print(notes[2][c] + " ");
                                if(e == 2){
                                        System.out.println(empty);
                                } else {
                                        System.out.print(notes[0][d]);
                                        System.out.print(notes[1][e]);
                                        System.out.println(notes[2][f]);
                                }
                        }
                }
        }
}