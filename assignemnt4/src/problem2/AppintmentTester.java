package problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppintmentTester {
public static void main(String[] args)
{ArrayList<Appointment> aa= new ArrayList<Appointment>();
Date d1=new Date(01,"Feb",2017);
Appointment event1=new Onetime("clean room",d1);
aa.add(event1);
Date d2=new Date(02,"Feb",2017);
Appointment event2=new Monthly("find a job",d2);
aa.add(event2);
Date d3=new Date(04,"Feb",2017);
Appointment event3=new Daily("go to school",d3);
aa.add(event3);

//System.out.println("Please enter a description");
Scanner in = new Scanner(System.in);
//String description=in.next();
System.out.println("Please enter a date");
Date date= new Date(in.nextInt(),in.next(),in.nextInt());

for(int i=0;i<aa.size();i++)
{
	if(aa.get(i).occursOn(date))
		System.out.println(aa.get(i).getdescription());
	}
	
}
}