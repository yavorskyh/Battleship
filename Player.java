
public class Player {
	private final int numColumns = 10;
	private final int numRows = 10;

	public int playerNum;

	// 0 = open ocean, 1 = ship
	public int[][] guessBoard;

	// 0 = no guess, 1 = correct guess, 2 = incorrect guess, 3 = represent a sunken ship
	public int[][] gameBoard;

	// constructors (int num = player number)
	public Player(){
		playerNum = 1;
		guessBoard = new int[numRows][numColumns];
		gameBoard = new int[numRows][numColumns];
		createGameBoard();
	}
	public Player(int num){
		playerNum = num;
		guessBoard = new int[numRows][numColumns];
		gameBoard = new int[numRows][numColumns];
		createGameBoard();
	}

	// initializes empty game board
	private static void createGameBoard(){
	char [][] gameBoard = new char[numColumns][numRows];

	//print top row of numbers
	System.out.print(" ");
	for(int i = 0; i < numColumns; i++)
	{
		System.out.print(i);
	}
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


	}

}
