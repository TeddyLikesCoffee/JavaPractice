
public class Cards {
	private String [] SUITS = {"Spades","Hearts","Diamonds","Clubs"};
	private String [] RANKS= {"2","3","4","5","6","7","8","9","10"};
	private String suit;
	private int rank;
	Cards(){
		this.suit=SUITS[(int)(Math.random()*SUITS.length)];
		this.rank=Integer.parseInt(RANKS[(int)(Math.random()*RANKS.length)]);
				
	};
	Cards(String suit,int rank){
		this.suit=suit;
		this.rank=rank;
	};
	public String getSuit() {return this.suit;}
	public int getRank() {return this.rank;}
	
	public boolean equals(Cards player, Cards house) {
		if(player.suit==house.suit && player.rank==house.rank ) {
			return true;
		}else {
			return false;
		}
		
	}
	public int compareHands(Cards [] player , Cards [] house) {
		if(calculateHand(player)>calculateHand(house)) {
			return 1;
		}else if(calculateHand(player)<calculateHand(house)){
			return 0;
		}else {
			return -1;
		}
		}
	public int calculateHand(Cards [] hand) {
		int count=0;
		for(int x=0;x<hand.length;x++) {
			count+=hand[x].getRank();
		}
		return count;
		
		}
	public String toString() {return "\n"+suit+" of "+rank+"\n";}
}
