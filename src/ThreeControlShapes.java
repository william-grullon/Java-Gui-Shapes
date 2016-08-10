import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.Random;

public class ThreeControlShapes extends JFrame
{
	
	private Color color= (Color.BLACK);
	private int x;	
	
	linePanel line;
	recPanel rectangle;
	ovalPanel oval;
	
	public ThreeControlShapes()
	{
		super("3 Shapes with Control: William Grullon");
		
		//Graphic Panels
		line = new linePanel();
		rectangle = new recPanel();
		oval = new ovalPanel();
		x=2;
		
		//Set rectangle as default shape
		getContentPane().add(rectangle, BorderLayout.CENTER);
		
		//Color Picker Panel Settings
		JPanel Color_Picker_Panel = new JPanel();
		getContentPane().add(Color_Picker_Panel, BorderLayout.EAST);
		Color_Picker_Panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		//Color Buttons
		JButton Picker = new JButton("Click to Change Color");
		Color_Picker_Panel.add(Picker);
		
		JButton Random = new JButton("Random Color");
		Color_Picker_Panel.add(Random);
		
		//color button Action Events
		Picker.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "Pick a Color", color);
						if(color==null)
							color=(Color.BLACK);
						
						if(x==1)
						{
							line.setC(color);						
							remove(line);
							add(line,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}
						
						if(x==2)
						{
							rectangle.setC(color);						
							remove(rectangle);
							add(rectangle,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}
						
						if(x==3)
						{
							oval.setC(color);						
							remove(oval);
							add(oval,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}					
					}
				}
		);
		
		Random.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Random rand = new Random();						
						float r = rand.nextFloat();
						float gr = rand.nextFloat();
						float b = rand.nextFloat();
						color = new Color(r, gr, b);
						if(color==null)
							color=(Color.BLACK);
						
						if(x==1)
						{
							line.setC(color);						
							remove(line);
							add(line,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}
						
						if(x==2)
						{
							rectangle.setC(color);						
							remove(rectangle);
							add(rectangle,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}
						
						if(x==3)
						{
							oval.setC(color);						
							remove(oval);
							add(oval,BorderLayout.CENTER);
							setVisible(true);
							repaint();
						}
						
					}
				}
		);
		
		//Shapes Panel Settings
		JPanel ShapesBottonsPanel = new JPanel();
		getContentPane().add(ShapesBottonsPanel, BorderLayout.WEST);
		ShapesBottonsPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		//Shape Buttons
		JButton LINE = new JButton("LINE ");
		ShapesBottonsPanel.add(LINE);
		
		JButton Rectangle = new JButton("Rectangle");
		ShapesBottonsPanel.add(Rectangle);
		
		JButton Oval = new JButton("Oval");
		ShapesBottonsPanel.add(Oval);
		
		//Shape Button Action Events
		LINE.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						if(x==2)
						{
							remove(rectangle);
							add(line, BorderLayout.CENTER);
							x=1;
							setVisible(true);
							repaint();						
						}
						
						if(x==3)
						{
							remove(oval);
							add(line, BorderLayout.CENTER);
							x=1;
							setVisible(true);
							repaint();							
						}	
					}
				}
		);
		
		Rectangle.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						if(x==1)
						{
							remove(line);
							add(rectangle, BorderLayout.CENTER);
							x=2;
							setVisible(true);
							repaint();						
						}
						
						if(x==3)
						{
							remove(oval);
							add(rectangle, BorderLayout.CENTER);
							x=2;
							setVisible(true);
							repaint();							
						}	
					}
				}
		);
		
		Oval.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						if(x==1)
						{
							remove(line);
							add(oval, BorderLayout.CENTER);
							x=3;
							setVisible(true);
							repaint();						
						}
						
						if(x==2)
						{
							remove(rectangle);
							add(oval, BorderLayout.CENTER);
							x=3;
							setVisible(true);
							repaint();							
						}	
					}
				}
		);
		
		//JFrame Settings
		setSize(600, 400);
		setLocationRelativeTo(null);// Center a frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // Display the frame
			
	}

	public Color getColor() {
		return color;
	}
}

