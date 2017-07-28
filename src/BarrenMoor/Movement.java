package BarrenMoor;

import java.util.Scanner;

public class Movement {

	int px = 10;
	int py = 10;

             
	    
	public void directionMove(String move) {
		switch (move) {
		  case "u": py += 1; break;
		  case "d": px += 1; break;
		  case "l": py -= 1; break;
		  case "r": px -= 1; break;
		  
		}
		}
	
		public static void delay(int millis) {
	        try {
	            Thread.sleep(millis);
	        } catch (InterruptedException exp) {
	        }
	}
}