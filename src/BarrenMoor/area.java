package BarrenMoor;

public class area extends mainGame {

	int[][] map = new int[20][20];

	public void initBoard() { // initiating the map size
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				this.map[i][j] = -1;
			}
		}
	}

	public void updatePlayerPosition(int x, int y) {
		map[x][y] = 2;
	}
	

	public void showMap(int[][] map) {
		System.out.println("\tA \tB \tC \tD \tE \tF \tH \tI \tJ \tK \tL \tM \tN \tO \tP \tQ \tR \tS \tT \tU"); // the
																												// column
																												// titles
		System.out.println();

		for (int i = 0; i < 20; i++) { // setting the boundaries for the map
										// equal to 20 x 20
			System.out.print((i + 1) + "");
			for (int j = 0; j < 20; j++) {
				if (this.map[i][j] == -1) {
					System.out.print("\t" + "~");
					// System.out.println("\n");
				} else if (this.map[i][j] == 0) {
					System.out.print("\t" + "o");
					// System.out.println("\n");
				} else if (map[10][10] == 1) {
					System.out.print("\t" + "X");
				} else if (map[10][10] == 2) {
					System.out.print("\t" + "P");
					// System.out.println("\n");

				}
			}
			System.out.println();
		}
	}
}
