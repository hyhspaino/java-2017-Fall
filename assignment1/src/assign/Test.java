// Problem 4

package assign;
import java.net.*;//no ...
//import javax.*;//no ... and this class is never used
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;// should import  javax.swing.JOptionPane if you want to use JOptionPane.showMessageDialog (line 12)
public class Test {// lose a { here in original code
	
	public static void main(String[] args) throws Exception {// the declaration  of a main method should be "public static void main",not"public Static main"
	URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
	JOptionPane.showMessageDialog(null, "Hello", "Title",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));//
	}

}
