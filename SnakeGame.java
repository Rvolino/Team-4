// TEAM 4
// Brad Adams, Robert Deetz, Ryan Volino
// brad.adams001@umb.edu
// usmcdeetz@gmail.com
// ryan.volino@gmail.com
// CS114
// Assignment 5
// Question 4

package snake;


public class SnakeGame {

	public static void main(String[] args) {

		System.out.println("-----------------------------");
		System.out.println("---  S N A K E   G A M E  ---");
		System.out.println("-----------------------------");
		System.out.println("To Enter a Command:");
		System.out.println("Type a single digit (distance), ");
		System.out.println("followed by a letter.");
		System.out.println("A \u2190");
		System.out.println("D \u2192");
		System.out.println("W \u2191");
		System.out.println("S \u2193");

		String header;
		String footer;
		String command;
		int points = 5;

		Snake snake = new Snake();
		Board board = new Board();
		Food food = new Food();
		SnakeTail tail = new SnakeTail();



		// Outer Loop
		while (points > 0) {
			header = "Points to Eat: " + points;
			footer = "Enter Command (Ex. 2A): ";



			// Layout Board
			// Initialize with empty space.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					board.cells[i][j] = ' ';
				}
			
		
			// Place Snake.
			
			}
			board.cells[snake.y][snake.x] = '\u2191';
			if(snake.direction == 'A'){
				board.cells[snake.y][snake.x] = '\u2190';}
			if(snake.direction == 'D'){
				board.cells[snake.y][snake.x] = '\u2192';}
			if(snake.direction == 'W'){
				board.cells[snake.y][snake.x] = '\u2191';}
			if(snake.direction == 'S'){
				board.cells[snake.y][snake.x] = '\u2193';}
			//if (snake.direction == 'A' || snake.direction == 'D') {
				//board.cells[snake.y][snake.x] = '\u2190';
			//}
			//else 
				//board.cells[snake.y][snake.x] = '\u2191';

			// Place Food.
			board.cells[food.y][food.x] = '\u2615';

			System.out.println();
			System.out.println("-----------------------------");
			System.out.println(header);

			// Print Board.
			for (int i = 0; i < board.cells.length; i++) {
				for (int j = 0; j < board.cells[0].length; j++) {
					System.out.flush(); System.out.print(board.cells[i][j]);
				}
				System.out.println();
			}
			System.out.print(footer);

			System.out.println();

			snake.move();

			if (snake.x == food.x && snake.y == food.y) {
				points--;
				if (points == 0) {
					System.out.print("ALL FOOD EATEN!");
				}
				else {
					System.out.print("Food Eaten!");
				}
				food = new Food();
			}


		}

	}
}


