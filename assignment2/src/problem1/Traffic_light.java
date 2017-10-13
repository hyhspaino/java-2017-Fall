package problem1;

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
/**
 * Constructs and set the traffic light status
 * @param color light color
 */
	public Traffic_light(String color) {
		this.color = color;
	}
/**
 * show the Traffic light 
 */
	public void show_traffic_light() {

		if (color.equals("green")) {
			Green_light();
		} else if (color.equals("red")) {
			Red_light();
		} else {
			Yellow_light();
		}

	}
	
	/**
	 * draw the yellow case and frame
	 */
	private void Yellow_light() {
		JFrame frame = new JFrame();
		frame.setSize(150, 120);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridLayout(1, 3, 0, 0));
		Ellipse_component component1 = new Ellipse_component();
		component1.set_x(0);
		component1.set_y(0);
		component1.set_color(Color.black);
		panel.add(component1);
		panel.setSize(150, 120);
		panel.setBackground(Color.white);
		Ellipse_component component2 = new Ellipse_component();
		component2.set_x(0);
		component2.set_y(0);
		component2.set_color(Color.yellow);
		panel.add(component2);
		Ellipse_component component3 = new Ellipse_component();
		component3.set_x(0);
		component3.set_y(0);
		component3.set_color(Color.black);
		panel.add(component3);
		frame.getContentPane().add(panel);
	}
/**
 * draw the red case and frame
 */
	private void Red_light() {
		JFrame frame = new JFrame();
		frame.setSize(150, 120);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridLayout(1, 3, 0, 0));
		Ellipse_component component1 = new Ellipse_component();
		component1.set_x(0);
		component1.set_y(0);
		component1.set_color(Color.black);
		panel.add(component1);
		panel.setSize(150, 120);
		panel.setBackground(Color.white);
		Ellipse_component component2 = new Ellipse_component();
		component2.set_x(0);
		component2.set_y(0);
		component2.set_color(Color.black);
		panel.add(component2);
		Ellipse_component component3 = new Ellipse_component();
		component3.set_x(0);
		component3.set_y(0);
		component3.set_color(Color.red);
		panel.add(component3);
		frame.getContentPane().add(panel);
	}
/**
 * draw the green case and frame
 */
	private void Green_light() {
		JFrame frame = new JFrame();
		frame.setSize(150, 120);
		frame.setTitle("Traffic_light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel(new GridLayout(1, 3, 0, 0));
		Ellipse_component component1 = new Ellipse_component();
		component1.set_x(0);
		component1.set_y(0);
		component1.set_color(Color.green);
		panel.add(component1);
		panel.setSize(150, 120);
		panel.setBackground(Color.white);
		Ellipse_component component2 = new Ellipse_component();
		component2.set_x(0);
		component2.set_y(0);
		component2.set_color(Color.black);
		panel.add(component2);
		Ellipse_component component3 = new Ellipse_component();
		component3.set_x(0);
		component3.set_y(0);
		component3.set_color(Color.black);
		panel.add(component3);
		frame.getContentPane().add(panel);
	
	}

}
