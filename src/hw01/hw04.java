package hw01;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//
public class hw04 extends JPanel{
	
	public static final int HEIGHT = 400;
	public static final int WIDTH = 400;
	public static final int randCount = (int) Math.random() * (7);
	public static final int randNum = (int) Math.random() * (9);
	public static final int Size = 20;
	public static final int XPosition = 20;
	public static final int YPosition = 20;

	

	
	@Override
	public void paintComponent(Graphics draw) {
		draw.fillRect(0, 0, HEIGHT, WIDTH);
		draw.fillOval(XPosition , YPosition , WIDTH, HEIGHT);
	}
	
	public hw04() {
		setPreferredSize(new Dimension(HEIGHT,WIDTH));
	}

	
	public static void main(String[] args) {
		JFrame window = new JFrame("hw04");
		window.setContentPane(new hw04());
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
