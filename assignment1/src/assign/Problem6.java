package assign;
///Declaration of the package
public class Problem6 {//Declaration of a class 
public static void main (String[] args)

{	double x=2.5;
	double y=-1.5;
	int n=17;
	int m=18;
	
	System.out.println("a.x+n*y-(x+n)*y="+(x+n*y-(x+n)*y));
	//=6.25 because x,y are double,so the answer is double
	System.out.println("b.m/n+m%n="+(m/n+m%n));
	//=2 because m n are int
	System.out.println("c.n%2+m%2="+(n%2+m%2));
	// =1 because m n are int
	System.out.println("d.(m+n)/2="+((m+n)/2));
	// =17 because m n are int
	System.out.println("e.(m+n)/2.0="+((m+n)/2.0));
	//=17.5 because 2.0 is double 
	System.out.println("f.(int)(0.5*(m+n))="+(int)(0.5*(m+n)));
	// = 17 because you do ¡°Type casting¡± 
	System.out.println("g.1-(1-(1-n))="+(1-(1-(1-n))));
	//=-16 because n,1 are int
	System.out.println("h.n%10+(n-(n%10))="+(n%10+(n-(n%10)))); 
	// =17 because n 10 are int 
  }
}
	
