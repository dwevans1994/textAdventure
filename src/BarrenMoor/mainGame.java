package BarrenMoor;

import java.util.Scanner;

public class mainGame {

	static String name;// strings
	static String output;
	String answer;
	
	 // 2d array
	char player;
	String character = "P";
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		area barren = new area();
		Movement character = new Movement();
	
		barren.initBoard();
		barren.updatePlayerPosition(character.px, character.py);
	
//		showMap(map);
//		barren.showMap(barren.map);

		System.out.println("Hi there, you have awaken, finally !!");//delay speech
		Thread.sleep(1000);
		System.out.println("You have woken in a barren moor.");
		Thread.sleep(1000); //delay speech
		System.out.println("What is your name? ");
		Thread.sleep(1000);
		name = importClass.sc.nextLine();
		Thread.sleep(1000);
		System.out.println("Hey " + name + " you can call me The Dark Knight!"); // the name the user has entered will now be saved to the string name
		System.out.println(" ");
		Thread.sleep(1000);
		System.out.println("Would you like to help me find the missing treasure? 'Yes' or 'No'");
		
		output = importClass.sc.nextLine();
		
		if (output.equalsIgnoreCase("yes"))// it takes the input and selects the option for the user
		{
			barren.showMap(barren.map); // shows the user the map
			System.out.println("Have a look around you, you are in a massive barren moor!");
			System.out.println("this is your map, P represents your location");
					
		
	}
		}


	     

//			public static void findTreasure(){
//				
//			}
//	            } System.out.println();
//	        }
//	        
//	        
//	        }public void go(String direction) {
//	            if(direction.equals("w") || direction.equals("west")) 
//	                goWest();
//	            else if(direction.equals("e") || direction.equals("east"))
//	                goEast();
//	            else if(direction.equals("n") || direction.equals("north"))
//	                goNorth();
//	            else if(direction.equals("s") || direction.equals("south"))
//	                goSouth();
//	          
//	        }

			
	    }

	
