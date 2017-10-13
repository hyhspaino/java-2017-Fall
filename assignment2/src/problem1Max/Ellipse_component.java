package problem1Max;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
/**
 * draw a circle for given x,y and color
 * @author hyh
 *
 */
public class Ellipse_component extends JComponent {
 
	Color color;
	int posY;
	/**
	 * Construct a ellipse and draw it
	 */
	public  void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		
		
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(10,10, 50, 50);
		Ellipse2D.Double ellipse2 = new Ellipse2D.Double(10,60, 50, 50);
		Ellipse2D.Double ellipse3 = new Ellipse2D.Double(10,110, 50, 50);

		Ellipse2D.Double ellipseColor = new Ellipse2D.Double(10,this.posY+10, 50, 50);
		
Rectangle box=new Rectangle(0,0,70,200);
g2.draw(box);
		// Draw ellipse
		g2.setColor(Color.black);
		g2.draw(ellipse1);
		g2.draw(ellipse2);
		g2.draw(ellipse3);
		g2.draw(ellipseColor);

		g2.setColor(Color.white);
		g2.fill(ellipse1);

		g2.fill(ellipse2);

		g2.fill(ellipse3);

		g2.setColor(this.color);

		g2.fill(ellipseColor);


	}
	/**
	 * set color for circle
	 * @param color color of circle
	 */
	
	public Ellipse_component(String color)
	{
		if(color=="red")
		{this.color=Color.red;
		this.posY=0;
	}
		else if (color=="yellow"){

			this.color=Color.yellow;
			this.posY=50;
		}
		else{

			this.posY=100;
			this.color=Color.green;
		}
		
		
	}
	
}