import javax.swing.JOptionPane;
public class sellMagazineMain {

	public static void main(String[] args) {
	 final double SALE_TAX=0.2;
	 double total=0.0;
	 int userChoice=0;
	 Magazine sportsIllustrated=new Magazine("Sports Illustrated", 5.25,100);
	 Magazine featuredMagazine=new Magazine();
	 do {
	 userChoice = Integer.parseInt(JOptionPane.showInputDialog("What Magazine would you like to purchase?\nChose 1 for Sports Illustrated\nChose 2 for Featured Magazine\nEnter 0 to Exit "));
	 switch(userChoice) {
	 case 1:
		 sportsIllustrated.sellOne();
		 total=sportsIllustrated.total(SALE_TAX);
		 JOptionPane.showMessageDialog(null, "You purchased a Sports illutrated Magazine $"+total);
		 break;
	 case 2:
		 featuredMagazine.sellOne();
		 total=featuredMagazine.total(SALE_TAX);
		 JOptionPane.showMessageDialog(null, "You purchased a Featured Magazine $"+total);
		 break;
	 }
	 }while(userChoice>0);
	 

	}


}
