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
	private JFrame frame;
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
		frame.setSize(150, 120);
		frame.setTitle("Traffic_light");
			Green_light(); 
			Red_light(); 
			Yellow_light(); 

	}
	
	/**
	 * draw the yellow case and frame
	 */
	private void Yellow_light() {
	
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
