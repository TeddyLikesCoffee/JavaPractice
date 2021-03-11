package Intruduction;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*Person user;
      user= new Person();
      user.age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
      user.firstName=JOptionPane.showInputDialog("what is your name");
      JOptionPane.showMessageDialog(null, user.personIntro());*/
		

		int [] balls= {10,2,8,6,7,3};
		int current = 0;
		int temp=0;
		int x=0;
		for(x=0; x < balls.length-1; x++) {
			for(int y=0; y <balls.length-x-1;y++) {
				if(balls[y]>balls[y+1]) {
					temp=balls[y+1];
					balls[y+1]=balls[y];
					balls[y]=temp;
					
			}
			}
			System.out.println( Arrays.toString(balls));
			for(int i=0; i < balls.length; i++) {
			 //System.out.println("\n"+balls[i]);
			}
		}
	}

}
