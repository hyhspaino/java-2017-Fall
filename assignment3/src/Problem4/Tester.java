package Problem4;

public class Tester {
public static void main (String[] agrs)
{
	Map map=new Map(4,4);
	map.set_height();
	map.set_flood_height(5);
	map.get_highest_point();
	map.get_lowest_point();
	map.print_flood_map();
	}
}
