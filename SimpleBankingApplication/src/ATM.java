import javax.swing.JOptionPane;
import java.io.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //final int MAX=5;
	    int userChoice;
	    String [] options= {"No", "Yes"};
		 Customer c= new Customer("Miriam", "Pantoja",29,"2156 Leesburg Pike Alexandria","VA",22302,false);
		 CheckingAccount account= new CheckingAccount(000045670,54285070,c,2234.00); 
	   // Customer customer= new Customer();
		//CheckingAccount [] account= new CheckingAccount[MAX];
		//System.out.println(c.toString());
		//System.out.println(menu());
		 int x= JOptionPane.showInternalOptionDialog(null,"Are you a new user?","Click yes for new user", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		 if(x>0) {
			 newUser();
		 }else {
			 existingUser(account);
		 }

	}
	public static void newUser() {
		Customer cust= new Customer();
		cust.setFirstName(JOptionPane.showInputDialog("First Name :"));
		cust.setLastName(JOptionPane.showInputDialog("Last Name: "));
		cust.setAge(Integer.parseInt(JOptionPane.showInputDialog("Age: ")));
		cust.setAddress(JOptionPane.showInputDialog("Address: "));
		cust.setState(JOptionPane.showInputDialog("State: "));
		cust.setZipCode(Integer.parseInt(JOptionPane.showInputDialog("Zip Code: ")));
		cust.setMaritalStatus(Boolean.parseBoolean(JOptionPane.showInputDialog("Married: ")));
		boolean validDeposit;
		CheckingAccount account=new CheckingAccount();
		account.setRoutingNum();
		account.setAccountNumber();
		account.setClient(cust);
		Double.parseDouble(JOptionPane.showInputDialog("Enter amount: "));
		JOptionPane.showMessageDialog(null,account.toString());
		
	};
	public static void existingUser(CheckingAccount account) {
		int userChoice;
	    int transaction=0;
	    boolean valid;
		do {
			userChoice=Integer.parseInt(JOptionPane.showInputDialog(menu()));
			switch(userChoice) {
			case 1:
					JOptionPane.showMessageDialog(null,account.toString());
					transaction=1;
				break;
			case 2:
				account.addBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter amount: ")));
				transaction=2;
				break;
			case 3:
				do {
					valid=account.withdrawl(Double.parseDouble(JOptionPane.showInputDialog("Enter amount: ")));
					transaction=3;
				}while(!valid);
				break;
			case 4:
				JOptionPane.showInternalMessageDialog(null, getPreviousTransaction(transaction));
				break;
			case 5:
				
				return ;
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
	public static String getPreviousTransaction(int transaction) {
		if(transaction==1) {
			return "You checked your balance";
		}else if(transaction==2) {
			return "You made a deposit";
		}else {
			return "You made a withdrawl";
		}
	}
}
