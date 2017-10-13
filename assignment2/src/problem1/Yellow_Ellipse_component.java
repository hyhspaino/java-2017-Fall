package problem1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * draw a circle for given x,y and color
 * 
 * @author hyh
 *
 */
public class Yellow_Ellipse_component extends JComponent {
	// double x;
	// double y;
	// Color color;
	/**
	 * Construct a ellipse and draw it
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100, 0, 50, 50);
		// Draw ellipse
		g2.setColor(Color.white);
		g2.draw(ellipse1);
		g2.fill(ellipse1);
		Ellipse2D.Double ellipse2 = new Ellipse2D.Double(100, 50, 50, 50);
		g2.setColor(Color.YELLOW);
		g2.draw(ellipse2);
		g2.fill(ellipse2);
		Ellipse2D.Double ellipse3 = new Ellipse2D.Double(100, 100, 50, 50);
		g2.setColor(Color.WHITE);
		g2.draw(ellipse3);
		g2.fill(ellipse3);
	}
}