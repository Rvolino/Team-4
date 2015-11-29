package q4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;// Import JFrame to create a GUI window.
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUI {// class GUI open.

	public JFrame jf;// GUI window.
	public JLabel jl;
	public JPanel jp;// Object in frame.

	public int width = 500;
	public int height = 1000;

	String header;
	String footer;
	String command;
	int points = 5;

	Snake snake = new Snake();
	Board board = new Board();

	public GUI() {

		frame();

	}

	public void frame() {// Frame open.

		jf = new JFrame ("Snake");// New window "Snake".
		jf.setVisible(true);// Initiates the window with boolean statement "true".
		jf.setSize(width, height);// Sets size of window.
		jf.setVisible(true);// Makes window visible. 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Exits program when window is closed.
		jf.setLocationRelativeTo(null);

		jp = new JPanel();
		jp.setBackground(Color.BLACK);// sets window background color.
		jl = new JLabel("test");
		jl.setForeground(Color.WHITE);// sets font of foreground objects.

		jp.add(jl);
		jf.add(jp);

	}// Frame close.

	public void graphics(Graphics g) {


	}


}// class GUI close.
