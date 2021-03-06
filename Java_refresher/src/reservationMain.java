import javax.swing.JOptionPane;
import java.io.*; 
public class reservationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room  reservation= new Room();
		int [] labRoom= new int[3];
		int [] room = new int[3];
		int choice=0;
		int seats;
		int x=0;
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(printMessage()));
			switch(choice) {
			case 1:
				do {
				seats=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of seats"));
				}while(!reservation.numOfSeats(seats));
				JOptionPane.showMessageDialog(null, "You chose a standar room "+ reservation.getNoneLab()+" with "+seats);
				break;
			case 2:
				do {
				seats=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of seats"));
				}while(!reservation.numOfSeats(seats));
				JOptionPane.showMessageDialog(null, "You chose a Lab "+ reservation.getLAB()+" with "+seats);
				break;
			}
		}while(choice>0);
		System.out.print(printMessage());
	}
	
public static String printMessage() {
	String options="###Reservation Portal###\nEnter 1 to reserve a room\nEnter 2 to reserver a lab";
	return options;
	}
}
