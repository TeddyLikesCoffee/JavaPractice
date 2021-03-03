import javax.swing.JOptionPane;
import java.io.*;
public class DVDCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int MAX_NUM_DVDS=2;
	Dvd[] dvds= new Dvd[MAX_NUM_DVDS];
	int counter=0;
	String dvdResults="\n\n";
		do {
			
			String genre=JOptionPane.showInputDialog("Enter the DVD Genre: ");
			String title=JOptionPane.showInputDialog("Enter the DVD Title: ");
			dvds[counter]= new Dvd(genre,title);
			System.out.println("\n"+dvds[counter].getTitle()+"\n"+dvds[counter].getGenre()+"\n\n");
			counter++;
			
		}while(MAX_NUM_DVDS>counter);
	
	for(int x=0; x < dvds.length; x++) {
			int numOfDvds=0;
			dvdResults=dvdResults.concat(" "+dvds[x].getTitle()+" "+dvds[x].getGenre()+" ");
    }
	JOptionPane.showMessageDialog(null,dvdResults);
	
	}
}
