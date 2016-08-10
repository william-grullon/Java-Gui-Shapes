import javax.swing.*;

import java.awt.*;


public class recPanel extends JPanel
{
	private Color color;
	
	recPanel()
	{
		color= (Color.BLACK);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		//Rectangle
		g.setColor(color);
		for(int i=0;i<11;i++)
			g.drawRect(5+(i*10), 10+(i*10), 100+(i*5), 100+(i*5));			
		//Rec Label
		g.drawString("Rectangle", 5, 300);		
	}

	public Color getColor()
	{
		return color;
	}

	public void setC(Color c)
	{
	this.color = c;
	}	
}