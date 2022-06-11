package dasar.praktek;

import java.util.*;
public class RandomNote {
	public static void main(String[] args) {
		char[][] notes = {
			{'c','d','e','f','g','a','b'},
			{'#', '-', ' '},
			{'1','2','3','4','5','6','7'}
		};
		Random bar = new Random();
		int bars = bar.nextInt(5);
		bars *= 16;
		if(bars == 0){
			bars += 16;
		}
		for(int what = 0;what <= bars;what++){
			Random rand = new Random();
			int a = rand.nextInt(7);
			int b = rand.nextInt(3);
			int c = rand.nextInt(7);
			if(b == 2){
				System.out.print("---\n");
			} else if((a == 2 || a == 6) && b == 0){
				continue;
			} else {
				System.out.print(notes[0][a]);
				System.out.print(notes[1][b]);
				System.out.print(notes[2][c] + "\n");
			}			
		}
	}
}