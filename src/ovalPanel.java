import javax.swing.*;

import java.awt.*;


public class ovalPanel extends JPanel
{
	private Color color;
	
	ovalPanel()
	{
		color= (Color.BLACK);
	}
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);	

		//Oval
		g.setColor(color);
		for(int i=0;i<11;i++)
			g.drawOval(5+(i*9), 10+(i*9), 100+(i*7), 100+(i*7));			
		//Oval Label
		g.drawString("Oval", 5, 300);				
	}
	
	public Color getColor(){
			return color;
	}
	
	public void setC(Color c)
	{
		this.color = c;
	}
}