/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author hyh
 */
public class Monthly extends Appointment {
	public Monthly(String desc, Date d) {
		super(desc, d);
	}

	public boolean occursOn(Date d) {
		if (getDate().getDay() == d.getDay() && getDate().getyear() == d.getyear()) {
			return true;
		}
		return false;
	}
}
