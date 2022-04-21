import java.util.*;

public class Player {
	static final int numColumns = 10;
	static final int numRows = 10;

	public int playerNum;
	public int numShips = 5;

	// 0 = open ocean, 1 = ship
	public char[][] guessBoard;
	//Board guessBoard;

	// 0 = no guess, 1 = correct guess, 2 = incorrect guess, 3 = represent a sunken ship
	public char[][] gameBoard;
	//	Board gameBoard;

	// constructors (int num = player number)
	public Player(){
		playerNum = 1;
		guessBoard = new char[numRows][numColumns];
		gameBoard = new char[numRows][numColumns];

		//calls gui
		// guessBoard = new Board();
		// gameBoard = new Board();
		createGameBoard();
	}
	public Player(int num){
		playerNum = num;
		guessBoard = new char[numRows][numColumns];
		gameBoard = new char[numRows][numColumns];

		//calls gui of board
		// guessBoard = new Board();
		// gameBoard = new Board();
		createGameBoard();
	}

	// initializes empty game board
	private void createGameBoard(){

		//creates grid (just opens it and thats it)
	//	gameBoard.createGrid();

	//	guessBoard.createGrid();

		for(int i = 0; i < gameBoard.length; i++)
		{
			for(int j = 0; j < gameBoard[i].length; j++)
				gameBoard[i][j] = '~';
		}


		for (int i = 0; i < guessBoard.length; i++)
		{
			for (int j = 0; j < guessBoard[i].length; j++)
				guessBoard[i][j] = '~';
		}

	}//end of createGameBoard()

	// prompts user to place ships into game board
	public void placeShips(){

		//is supposde to assign/deploy a ship when button is pressed
	// 		Pressed pressedB;
	//
	// 		int shipsDeployed = 0;
	// 		do {
	// 			pressedB = gameBoard.new Pressed();
	// 			shipsDeployed++;
	// 		} while (shipsDeployed != 5);



		Scanner input = new Scanner(System.in);
		System.out.println("Player " + playerNum + " please place your ships");
		int shipsDeployed = 0;

		do
		{
			System.out.print("X coordinate for ship " + (shipsDeployed + 1) + ": ");
			int xCord = input.nextInt();

			System.out.print("Y coordinate for ship: " + (shipsDeployed + 1) + ": ");
			int yCord = input.nextInt();

			if ((xCord >= 0 && xCord < numRows) && (yCord >= 0 && yCord < numColumns) && (gameBoard[xCord][yCord] == '~'))
			{
				gameBoard[xCord][yCord] = 'x';
				System.out.print("Your ship was deployed\n");
				shipsDeployed++;
			}
			else
				System.out.println("Coordinates out of bounds. Try again.");

		}while (shipsDeployed !=  5);


	}//end of placeShips()



	// prompts user to select spot on game board to attack
		// (make sure to include error checking user selects their own ship or user selects invalid x and y coordinate)
		// (if user selects correctly, they get another shot at guessing)

	  public void attack(Player enemy){

		int xC, yC; // coordinates

		Scanner s = new Scanner(System.in);
		printGuessBoard();
		System.out.print("Player " + playerNum + " please enter X coordinate: ");
		xC = s.nextInt();
		System.out.print("Player " + playerNum + "  please enter Y coordinate: ");
		yC = s.nextInt();

		// makes sure that the ship is on the board
		if ((xC < 0 || xC >= numRows) || (yC < 0 || yC >= numColumns))
		{
			System.out.println("Out of bounds. Try again.");
			this.attack(enemy);
		}

		// Enemy ship is already sunk
		else if (enemy.gameBoard[xC][yC] == '@')
		{
			System.out.println("Ship already sunk. Try again.");
			this.attack(enemy);
		}

		// Player gave correct guess
		else if (enemy.gameBoard[xC][yC] == 'x')
		{
			System.out.println("You sunk the ship!");
			guessBoard[xC][yC] = '!';
			enemy.gameBoard[xC][yC]  =  '@';
			enemy.numShips--;

			if (enemy.numShips != 0)
				this.attack(enemy);
		}

		// Player gave incorrect guess
		else if (enemy.gameBoard[xC][yC] == '~')
		{
			System.out.println("You missed");
			guessBoard[xC][yC] = '-';
			printGuessBoard();
		}

	}//end of attack()



	// print out the current state of the game board
	public void printGameBoard(){

		System.out.println("\n-----Player "  + playerNum + "-----");
		System.out.println("----Game Board----");
		System.out.println();

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
		System.out.println();

	}//end of print()

	public void printGuessBoard() {
		System.out.println("\n-----Player "  + playerNum + "-----");
		System.out.println("----Guess Board----");
		System.out.println();

		//print top row of numbers
		System.out.print("  ");
		for(int i = 0; i < numColumns; i++)
		{
			System.out.print(i);
		}
		System.out.println();

		for(int i = 0; i < guessBoard.length; i++)
		{
			for(int j = 0; j < guessBoard[i].length; j++)
			{
				if (j == 0)
						System.out.print(i + "|" + guessBoard[i][j]);
				else
						System.out.print(guessBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println(); System.out.println();
	}//end of printGuessBoard()

}//end of player
