// TEAM 4
// Brad Adams, Robert Deetz, Ryan Volino
// brad.adams001@umb.edu
// usmcdeetz@gmail.com
// ryan.volino@gmail.com
// CS114
// Assignment 5
// Question 4

package snake;

public class Food {

	public int x;
	public int y;

	public Food() {

		x = (int) (Math.random() * 10);
		y = (int) (Math.random() * 5);
	}
}

