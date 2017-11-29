package problem2;

public abstract class Appointment {
private Date date;
private String description;
public Appointment(String desc, Date d)
{
	description=desc;
	date=d;
	}
public Date getDate() {
	return date;
}
public String getdescription() {
	return description;
}
public String toString() {
	return description+date.toString();
}

public abstract boolean occursOn(Date date);

} 
