package BarrenMoor;

public class mainGame {

	static String name;// strings
	static String output;
	static String move;
	String answer;

	// 2d array
	char player;
	String character = "P";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area barren = new area();
		Movement character = new Movement();
		int counter = 0;
		barren.initBoard(5,5);// the point you need to get too
		barren.updatePlayerPosition(character.px, character.py);
		try {
		// showMap(map);
		// barren.showMap(barren.map);
		System.out.println("Grey foggy clouds float oppressively close to you, \nreflected in the murky grey water which reaches up your shins. \nSome black plants barely poke out of the shallow water.");
		Thread.sleep(1000);
		System.out.println("Hi there, you have awaken, finally !!");// delay
																	// speech
		
			Thread.sleep(1000);
			System.out.println("You have woken in a barren moor.");
			Thread.sleep(1000); // delay speech
			System.out.println("What is your name? ");
			Thread.sleep(1000);
			name = importClass.sc.nextLine();
			Thread.sleep(1000);
			System.out.println("Hey " + name + " you can call me The Dark Knight!"); // the
																						// name
																						// the
																						// user
																						// has
																						// entered
																						// will
																						// now
																						// be
																						// saved
																						// to
																						// the
																						// string
																						// name
			Thread.sleep(1000);
			System.out.println("Would you like to help me find the missing treasure? 'Yes' or 'No', you have to getr from P to P");
			output = importClass.sc.nextLine();
			output.equalsIgnoreCase("yes"); // it takes the input and selects
											// the option for the user

			barren.showMap(area.map); // shows the user the map
			System.out.println("Have a look around you, you are in a massive barren moor!");
			System.out.println("this is your map, P represents your location");
			Thread.sleep(1000);
			while (counter < 200){
			System.out.println("please select your direction 'u' or 'd' or 'l' or 'r' ");
			barren.updatePlayerPosition(character.px, character.py);
			move = importClass.sc.nextLine();
			character.directionMove(move);
			barren.showMap(area.map);
			 
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.exit(0);

	}
}

// public static void findTreasure(){
//
// }
// } System.out.println();
// }
//
//
// }public void go(String direction) {
// if(direction.equals("w") || direction.equals("west"))
// goWest();
// else if(direction.equals("e") || direction.equals("east"))
// goEast();
// else if(direction.equals("n") || direction.equals("north"))
// goNorth();
// else if(direction.equals("s") || direction.equals("south"))
// goSouth();
//
// }
