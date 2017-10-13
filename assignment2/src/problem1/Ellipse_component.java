package problem1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * draw the 3 traffic lights
 * 
 * @author hyh
 *
 */
public class Ellipse_component extends JComponent {

	/**
	 * Construct traffic lights and draw it
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle box = new Rectangle(45, 25, 60, 240);
		g2.draw(box);
		Rectangle box1 = new Rectangle(245, 25, 60, 240);
		g2.draw(box1);
		Rectangle box2 = new Rectangle(145, 25, 60, 240);
		g2.draw(box2);
		// Draw green traffic light
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(50, 50, 50, 50);

		g2.setColor(Color.GREEN);
		g2.draw(ellipse1);
		g2.fill(ellipse1);
		Ellipse2D.Double ellipse2 = new Ellipse2D.Double(50, 120, 50, 50);
		g2.setColor(Color.white);
		g2.draw(ellipse2);
		g2.fill(ellipse2);
		Ellipse2D.Double ellipse3 = new Ellipse2D.Double(50, 190, 50, 50);
		g2.setColor(Color.WHITE);
		g2.draw(ellipse3);
		g2.fill(ellipse3);

		// Draw red traffic light
		Ellipse2D.Double red_ellipse = new Ellipse2D.Double(250, 50, 50, 50);
		// Draw ellipse
		g2.setColor(Color.WHITE);
		g2.draw(red_ellipse);
		g2.fill(red_ellipse);
		Ellipse2D.Double red_ellipse1 = new Ellipse2D.Double(250, 120, 50, 50);
		g2.setColor(Color.white);
		g2.draw(red_ellipse1);
		g2.fill(red_ellipse1);
		Ellipse2D.Double red_ellips3 = new Ellipse2D.Double(250, 190, 50, 50);
		g2.setColor(Color.red);
		g2.draw(red_ellips3);
		g2.fill(red_ellips3);

		// Draw yellow traffic light
		Ellipse2D.Double yellow_ellipse1 = new Ellipse2D.Double(150, 50, 50, 50);
		// Draw ellipse
		g2.setColor(Color.white);
		g2.draw(yellow_ellipse1);
		g2.fill(yellow_ellipse1);
		Ellipse2D.Double yellow_ellipse2 = new Ellipse2D.Double(150, 120, 50, 50);
		g2.setColor(Color.YELLOW);
		g2.draw(yellow_ellipse2);
		g2.fill(yellow_ellipse2);
		Ellipse2D.Double yellow_ellipse3 = new Ellipse2D.Double(150, 190, 50, 50);
		g2.setColor(Color.WHITE);
		g2.draw(yellow_ellipse3);
		g2.fill(yellow_ellipse3);

	}

}