package window;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;

import drawable.Canvas;

public class Main {

	
	public static void main(String[] args) 
	{
		
		
		JFrame window = new JFrame();
		Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		
		
		window.setSize(r.width , r.height);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setLocationRelativeTo(null);
		window.setUndecorated(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Canvas canvas = new Canvas(window);
		canvas.start();
		window.add(canvas);
		window.setVisible(true);
	}

}
