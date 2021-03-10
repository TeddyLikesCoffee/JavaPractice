import javax.swing.JOptionPane;
import java.io.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final int MAX=5;
	    int userChoice;
	    boolean valid;
		 Customer c= new Customer("Miriam", "Pantoja",29,"2156 Leesburg Pike Alexandria","VA",22302,false);
		 CheckingAccount account= new CheckingAccount(000045675,54285072,c,2234.00); 
	   // Customer customer= new Customer();
		//CheckingAccount [] account= new CheckingAccount[MAX];
		//System.out.println(c.toString());
		//System.out.println(menu());
		do {
			userChoice=Integer.parseInt(JOptionPane.showInputDialog(menu()));
			switch(userChoice) {
			case 1:
					JOptionPane.showMessageDialog(null,account.toString());
				break;
			case 2:
				account.addBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter amount: ")));
				break;
			case 3:
				do {
					valid=account.withdrawl(Double.parseDouble(JOptionPane.showInputDialog("Enter amount: ")));
				}while(!valid);
				break;
			case 4:
				break;
			case 5:
				return;
			}
		}while(userChoice!=5);
	}
	public static String printMessage(Object c) {
		String message=c.toString();
		return message;
	}
	public static String menu() {
		return "\n1-Check your balace"
				+"\n2-Make a deposit"
				+"\n3-Make a withdrawl"
				+"\n4-View the previous transaction"
				+"\n5-Exit the application";
	}
}
