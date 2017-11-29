package problem2;

public class Date {
private String month;
private int day;
private int year;
public Date(int day,String month,int year)
{this.month=month;
this.day=day;
this.year=year;
	}
public String getMonth() {
	return month;
}
public int getDay()
{return day;}

public int getyear()
{return year;}

public String toString() {
return day+" "+month+" "+year;
}
}

