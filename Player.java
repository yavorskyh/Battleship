
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
		
	}
	
}
