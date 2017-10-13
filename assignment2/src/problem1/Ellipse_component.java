package problem1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
/**
 * draw a circle for given x,y and color
 * @author hyh
 *
 */
public class Ellipse_component extends JComponent {
	double x;
	double y;
	Color color;
	public  void paintComponent(Graphics g) {// Construct a ellipse and draw it
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(x, y, 50, 50);
		// Draw ellipse
		g2.setColor(color);
		g2.draw(ellipse1);
		g2.fill(ellipse1);

	}
	/**
	 * set color for circle
	 * @param color color of circle
	 */
	
	public void set_color(Color color)
	{
		this.color=color;
	}
	/**
	 *  set x for circle
	 * @param x The coordinates of the x-axis
	 */
	public void set_x(double x)
	{
		this.x=x;
	}
	/**
	 * set y for circle
	 * @param y The coordinates of the y-axis
	 */
	public void set_y(double y)
	{
		this.y=y;
	}
}