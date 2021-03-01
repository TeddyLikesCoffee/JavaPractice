import javax.swing.JOptionPane;
public class mowingAreaMain {

	public static void main(String args[] ) {
		//get the radius from User
		Area userInput= new Area();
		double radius;
		do {
		radius=Double.parseDouble(JOptionPane.showInputDialog("Please Enter the radious area: "));
		}while(!userInput.checkUserInput(radius));
		JOptionPane.showInternalMessageDialog(null, "The area of the space is : "+ userInput.calcArea(radius));
	}

}
