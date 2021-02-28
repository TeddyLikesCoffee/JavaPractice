package Lawn;
import javax.swing.JOptionPane;
public class LawnNoInformationHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleNoInformationHiding lawn = new CircleNoInformationHiding();
		double lawnRadius=0.0;
		lawnRadius=Integer.parseInt(JOptionPane.showInputDialog("Enter Radius"));
		lawn.radius=lawnRadius;
		JOptionPane.showMessageDialog(null, "Area for the lawn "+ lawn.area());
		
	}

}
