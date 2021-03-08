import javax.swing.JOptionPane;
import java.io.*;
public class DVDCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int MAX_NUM_DVDS=2;
	Dvd[] dvds= new Dvd[MAX_NUM_DVDS];
	int counter=0;
	
		do {
			
			String genre=JOptionPane.showInputDialog("Enter the DVD Genre: ");
			String title=JOptionPane.showInputDialog("Enter the DVD Title: ");
			dvds[counter]= new Dvd(genre,title);
			System.out.println("\n"+dvds[counter].getTitle()+"\n"+dvds[counter].getGenre()+"\n\n");
			counter++;
			
		}while(MAX_NUM_DVDS>counter);
	

	JOptionPane.showMessageDialog(null,DVDCollection(dvds));
	
	}
	
	public static String DVDCollection(Dvd[] dvds) {
		String dvdResults="\n\n";
		for(int x=0; x < dvds.length; x++) {
			dvdResults=dvdResults.concat(" "+dvds[x].getTitle()+"\n"+dvds[x].getGenre()+"\n\n");
		}
		return dvdResults;
		}
}
