import javax.swing.*;

import java.awt.*;


public class linePanel extends JPanel
{	
	private Color color;
	
	linePanel()
	{
		color= (Color.BLACK);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//this.setBackground(Color.WHITE);		
		
		
		//Line
		g.setColor(getColor());
		for(int i=0;i<11;i++)
			g.drawLine(5, 10, 300, 20+(i*25));
			
		//Line Label
		g.drawString("LINE", 5, 300);
			
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