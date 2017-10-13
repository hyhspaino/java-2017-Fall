package problem1;

import javax.swing.JFrame;

/**
 * show a traffic light in a frame
 * @author hyh
 *
 */
public class Traffic_light {
//	private String color;
//	private JFrame frame;
/**
 * Constructs and set the traffic light status
 * @param color light color
 */
	public Traffic_light() {
	}
/**
 * show the Traffic light 
 */
	public void show_traffic_light() {

	      JFrame frame = new JFrame();
	      frame.setSize(500, 500);
	      frame.setTitle("three traffic light");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Ellipse_component component = new  Ellipse_component();
	      frame.add(component);
	      frame.setVisible(true);

	}

}
