package LinkedListPractice;
import javax.swing.JOptionPane;
public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LikedList test= new LikedList();
		test.add(95);
		test.add(91);
		test.add(92);
		test.add(97);
		JOptionPane.showMessageDialog(null,"result " + test.getSize());
		JOptionPane.showMessageDialog(null,"result " + test.remove(97));
		JOptionPane.showMessageDialog(null,"result " + test.getSize());
		//JOptionPane.showMessageDialog(null,"result " + test.toString());

	}
	


}
