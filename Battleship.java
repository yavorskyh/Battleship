import java.util.*;

public class Battleship {

	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(2);

		player1.placeShips(1);
		player1.printGameBoard(1);
		player2.placeShips(2);
		player2.printGameBoard(2);


		//
		// do{
		// 	player1.printGameBoard();
		// 	player1.attack();
		//
		// 	player2.printGameBoard();
		// 	player2.attack();
		//
		// }while(player1Ships != 0 || player2Ships != 0 );

	}//end of main



	// prompts user to select spot on game board to attack
	// (make sure to include error checking user selects their own ship or user selects invalid x and y coordinate)
	// (if user selects correctly, they get another shot at guessing)
	
  public static void attack(int playerNum){
	
	int xC, yC; // coordinates

	Scanner s = new Scanner(System.in);
	System.out.print("Enter X coordinate");
	xC = s.nextInt();
	System.out.print("Enter Y coordinate");
	yC = s.nextInt();

	if (guessboard[xC][yC] == "x")
	{
		System.out.println("You sunk the ship!");
		guessboard[xC][yC] = "!";
		--BattleShip.placeShips;
	}

	else if (guessboard[xC][yC] == "@")
	{
		System.out.println("You sunk your own ship!"); 
		guessboard[xC][yC] = "x";
		--BattleShip.placeShips;
	}
	
	else if (guessboard[xC][yC] == " " )
	{
		System.out.println("You missed");
		guessboard[xC][yC] = "-";
	}

	// makes sure that the ship is on the board
	else if ((x < 0 || x >= numRows) || (y < 0 || y >= numColumns)
	{
		System.out.println("Out of bounds. Try again:);
	}
	
}
