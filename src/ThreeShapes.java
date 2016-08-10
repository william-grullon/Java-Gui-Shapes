import java.awt.*;
import javax.swing.*;


public class ThreeShapes extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		//Line
		g.setColor(Color.BLACK);
		for(int i=0;i<11;i++)
			g.drawLine(5, 10, 200, 20+(i*20));
		
		//Line Label
		g.drawString("LINE", 5, 250);
		
		//Rectangle
		g.setColor(Color.RED);
		for(int i=0;i<11;i++)
			g.drawRect(225+(i*10), 10+(i*10), 100+(i*5), 100+(i*5));
		
		//Rec Label
		g.drawString("Rectangle", 225, 250);
		
		
		//Oval
		g.setColor(Color.GREEN);
		for(int i=0;i<11;i++)
			g.drawOval(500+(i*9), 10+(i*9), 100+(i*7), 100+(i*7));
		
		//Oval Label
		g.drawString("Oval", 500, 250);
		
		
	}

}

