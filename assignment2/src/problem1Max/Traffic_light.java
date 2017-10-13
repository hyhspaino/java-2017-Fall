package problem1Max;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * show a traffic light in a frame
 * @author hyh
 *
 */
public class Traffic_light {
	private String color;
	private JFrame frame;
	private JPanel panelAll;
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
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panelAll = new JPanel(new GridLayout(1, 3, 0, 0));

		frame.getContentPane().add(panelAll);
		frame.setTitle("Traffic_light");
		Ellipse_component component1 = new Ellipse_component("red");
		Ellipse_component component2 = new Ellipse_component("yellow");
		Ellipse_component component3 = new Ellipse_component("green");
		 
	   
		panelAll.add(component1);

		panelAll.add(component2);

		panelAll.add(component3);
	}
 
}
