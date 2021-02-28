package Intruduction;
import javax.swing.JOptionPane;
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person user;
      user= new Person();
      user.age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      user.firstName=JOptionPane.showInputDialog("what is your name");
      JOptionPane.showMessageDialog(null, user.personIntro());
	}

}
