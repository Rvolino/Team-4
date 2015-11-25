package snake;
 
import java.awt.Color;
import javax.swing.JFrame;// Import JFrame to create a GUI window.

public class Snake {// class Snake open.
	
	public JFrame jframe;// GUI window.
	public int timer = 0;
	 
	public static void main(String[] args) {// main open.
		
		new Snake();// Start new Snake window.
		
	}//main close.
	
	public Snake(){// public Snake open.
		
		jframe = new JFrame ("Snake");// New window "Snake".
		jframe.setVisible(true);// Initiates the window with boolean statement "true".
		jframe.setBackground(Color.BLACK);
		jframe.setSize(500, 500);// Sets size of window.
		
	}// public Snake close.
	
	
}// class Snake close.
