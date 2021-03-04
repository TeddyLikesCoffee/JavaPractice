import javax.swing.JOptionPane;
import java.io.*; 
public class eCasino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_OF_CARDS=3;
		Cards [] player=new Cards[NUM_OF_CARDS];
		getCards(player);
		
		Cards [] house=new Cards[NUM_OF_CARDS];
		getCards(house);
		
		printHands(player);
		printHands(house);
		JOptionPane.showMessageDialog(null, winner(player,house));
		
	}
	public static String winner(Cards [] player, Cards [] house) {
		Cards card= new Cards();
		if(card.compareHands(player, house)==1) {
			return "The player wins!";
		}else if(card.compareHands(player, house)==0) {
			return "The house wins!";
		}else {
			return "match!";
		}
	}
	public static void getCards(Cards [] card) {
		for(int x=0;x<card.length;x++) {
			card[x]=new Cards();
		}
	}
	
	public static void printHands(Cards [] cards) {
		String results="";
		for(int x=0; x<cards.length;x++) {
			results+=cards[x].toString();
		}
		System.out.println(results);
		
	}
}
