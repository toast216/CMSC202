package proj1;

import java.util.Scanner;

public class Proj1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row;
		System.out.print("Hi, please enter a number of rows: ");
		row = input.nextInt();
		while(row < 5)
		{
			System.out.print("Please enter a number greater then 4: ");
			row = input.nextInt();
		}
		int col;
		System.out.print("Hi, please enter a number of cols: ");
		col = input.nextInt();
		while(col < 5)
		{
			System.out.print("Please enter a number greater then 4: ");
			col = input.nextInt();
		}
		
		ConnectFour game = new ConnectFour(row, col);
		
		printBoard(game);
		while(gameState==true)
		{
			int a=numRows-1;
			
			
			if(playerTurn==true)
			{
				getMove(input);
				while(gameBoard[a][playerMove-1]!=0)
					a--;
				gameBoard[a][playerMove-1] = -1;
				printBoard(gameBoard);
				playerTurn = false;
			}
			else
			{
				getMove(input);
				while(gameBoard[a][playerMove-1]!=0)
					a--;
				gameBoard[a][playerMove-1] = 1;
				printBoard(gameBoard);
				playerTurn = true;
			}
			
		}
	}
}