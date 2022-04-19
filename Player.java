import java.util.*;

public class Player {
	static final int numColumns = 10;
	static final int numRows = 10;

	public int playerNum;

	// 0 = open ocean, 1 = ship
	public int[][] guessBoard;

	// 0 = no guess, 1 = correct guess, 2 = incorrect guess, 3 = represent a sunken ship
	//static char[][] gameBoard;
	public char[][] gameBoard;

	// constructors (int num = player number)
	public Player(){
		playerNum = 1;
		guessBoard = new int[numRows][numColumns];
		gameBoard = new char[numRows][numColumns];
		createGameBoard();
	}
	public Player(int num){
		playerNum = num;
		guessBoard = new int[numRows][numColumns];
		gameBoard = new char[numRows][numColumns];
		createGameBoard();
	}

	// initializes empty game board
	private void createGameBoard(){

		//print top row of numbers
		System.out.print(" ");
		for(int i = 0; i < numColumns; i++)
			System.out.print(i);

		System.out.println();

		for(int i = 0; i < gameBoard.length; i++)
		{
			for(int j = 0; j < gameBoard[i].length; j++)
			{
				gameBoard[i][j] = '~';
				if (j == 0)
						System.out.print(i + "|" + gameBoard[i][j]);
				else
						System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}

	}//end of createGameBoard()

	// prompts user to place ships into game board
	public void placeShips(){

		//creates gameboard and assigns it accordingly based on playerNum input
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlayer place your ships");


		for (int i=1; i <= 5; i++) // 5 ships?
		{
			System.out.print("X coordinate for ship " + i + ": ");
			int xCord = input.nextInt();

			System.out.print("Y coordinate for ship: " + i + ": ");
			int yCord = input.nextInt();

			if ((xCord >= 0 && xCord < numRows) && (yCord >= 0 && yCord < numColumns) && (gameBoard[xCord][yCord] == '~'))
			{
				gameBoard[xCord][yCord] = 'x';
				System.out.print("Your ship was deployed\n");
			}
		}

	}//end of placeShips()



	// prompts user to select spot on game board to attack
	// (make sure to include error checking user selects their own ship or user selects invalid x and y coordinate)
	// (if user selects correctly, they get another shot at guessing)
	public static void attack(int playerNum){

	}//end of attack()


	// print out the current state of the game board (current player cannot see other player ship
	// locations, only hits, misses, and locations of sunken ships of other player)
	public void printGameBoard(){


		//print top row of numbers
		System.out.print("  ");
		for(int i = 0; i < numColumns; i++)
		{
			System.out.print(i);
		}
		System.out.println();

		for(int i = 0; i < gameBoard.length; i++)
		{
			for(int j = 0; j < gameBoard[i].length; j++)
			{
				if (j == 0)
						System.out.print(i + "|" + gameBoard[i][j]);
				else
						System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}

	}//end of print

}//end of player
