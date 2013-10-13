/**
 * This class is for the ConnectFour Object to be used in Project1
 *
 * @author Raphael Chazelle <c50@umbc.edu>
 * @version Sept 19, 2013
 * @project CMSC 202 - Fall 2013 - Project #1
 * @section FIND THIS OUT
 */
package proj1;

import java.util.Scanner;

public class ConnectFour {
	
		
	private int numRows;
	private int numCols;
	private int gameBoard[][];
	private boolean gameState = true; //while true nobody has won, game is still being played, false = a win by a player
	private boolean playerTurn = true; //player 1 = true player 2 = false
	private int playerMove;
	
	
	
	
	
	public ConnectFour(int row, int col) 
	{
		
		numRows = row;
		numCols = col;
		
		createBoard(numRows, numCols);
	}
	
	
	public void createBoard(int rows, int cols)
	{
		gameBoard = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				gameBoard[i][j] = 0;
			}
		}
	}
	
	
	
	public void printBoard(ConnectFour board)
	{
		for(int i=0; i<numRows;i++)
		{
			for(int j=0; j<numCols; j++)
			{
				if (board.gameBoard[i][j]==-1)
				{
					System.out.print("x");
				}
				else if(board.gameBoard[i][j]==1)
				{
					System.out.print("o");
				}
				else 
				{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
	
	public void getMove(Scanner input)
	{
		if(playerTurn==true)
		{
			System.out.println("Player one, please enter a move: ");
			playerMove = input.nextInt();
		}
		else
		{
			System.out.println("Player two, please enter a move: ");
			playerMove = input.nextInt();
		}
	}
	/*
	public String toString(int board[][], String stringToBoard){
		
		for(int i=0; i<numRows; i++){
		
			for(int j=0; j<numCols; j++){
		
				if(gameBoard[i][j]==0){
					stringToBoard += "_";
				} else if(gameBoard[i][j]==-1){
					stringToBoard += "x";
				} else {
					stringToBoard += "o";
				}
			}
			stringToBoard += "\n";
		}
		return stringToBoard;
	}
	*/
	
}
