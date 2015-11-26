package q4;

import java.util.Scanner;

public class SnakeGame {

	public static void main(String[] args) {
		String header;
		String footer;
		String command;
		int points = 5;
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("---  S N A K E   G A M E  ---");
		System.out.println("-----------------------------");
		System.out.println("To Enter a Command:");
		System.out.println("Type a single digit (distance), ");
		System.out.println("followed by a letter.");
		System.out.println("A <-");
		System.out.println("D ->");
		System.out.println("W UP");
		System.out.println("S DOWN");

		// Outer Loop
		while (points > 0) {
			header = "Points to Eat: " + points;
			footer = "Enter Command (Ex. 2A): ";
			
			
			// Create objects: Snake, Food, Board.
			Snake snake = new Snake();
			Food food = new Food();
			Board board = new Board();
			
			
			// Layout Board
			// Initialize with empty space.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					board.cells[i][j] = ' ';
				}
			}
			
			// Place Snake.
			board.cells[snake.y][snake.x] = '|';
			
			// Place Food.
			board.cells[food.y][food.x] = 'o';
			
			System.out.println("-----------------------------");
			System.out.println(header);
			
			// Print Board.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					System.out.print(board.cells[i][j]);
				}
				System.out.println();
			}
			System.out.print(footer);
			command = input.nextLine();
			System.out.println();
			
			snake.move(command);
			
			points--;
				
		}

	}

}
