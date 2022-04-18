
public class Battleship {
	
	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(2);
		
	}
	
	// print out the current state of the game board (current player cannot see other player ship
	// locations, only hits, misses, and locations of sunken ships of other player)
	public static void printGameBoard(int playerNum){
		
	}
	
	// prompts user to place ships into game board
	public static void placeShips(int playerNum){
	
	Scanner read = new Scanner(System.in);
	System.out.println("/n Player:" + playerNum + " place your ships");
	
	for (int i=1; i <= 5; i++) // 5 ships?
	{
		System.out.print("X coordinate for" + i + "ship");
		int xCord = input.NextInt();

		System.out.print("Y coordinate for" + i + "ship");
		int yCord = input.NextInt();

		if ((xCord >= 0 && xCord < numRows) && (yCord >= 0 && yCord < numColumns) && (gameboard[xCord][yCord] == " "))
		{
			gameboard[xCord][yCord] = "x";
			System.out.print(i + "your ship was deployed");
			i++;
		}
	}	
		printGameBoard();

	}
	
	// prompts user to select spot on game board to attack 
	// (make sure to include error checking user selects their own ship or user selects invalid x and y coordinate)
	// (if user selects correctly, they get another shot at guessing)
	public static void attack(int playerNum){
		
	}


}
