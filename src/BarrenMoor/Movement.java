package BarrenMoor;

public class Movement {

	int px = 10;
	int py = 10;
	


             
	    
	public void directionMove(String move) {
		
		switch (move) {
		  case "u": px -= 1; break;
		  case "r": py += 1; break;
		  
		  case "l": py -= 1; break;
		  case "d": px += 1; break;	
		
			       
			}
		area.map[px][py] = 'P';
		area.map[5][5] = 'T';

		}
		
	
	
}