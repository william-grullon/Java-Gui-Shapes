import javax.swing.*;
import java.awt.*;

public class testThreeShapes 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Three Shapes: by William Grullon"); // Create a frame	
		
		/*
		ThreeShapes s = new ThreeShapes();
		frame.add(s);		
		frame.setSize(800, 350); // Set the frame size
		//frame.pack();
		frame.setLocationRelativeTo(null);// Center a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
		*/	
		
		//ThreeControlShapes c = new ThreeControlShapes();
		
		ThreeTimerShapes t = new ThreeTimerShapes();
	}

}

