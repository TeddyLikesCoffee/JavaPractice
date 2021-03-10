import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class AggregationPractice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> a = new ArrayList();
		Student [] s= new Student[2];
		s[0] = new Student("Miriam Pantoja",1234,"IT");
		s[1] = new Student("Nelly Pantoja",1234,"IT");
		
		
		//System.out.println(s);
		for(int x=0; x<s.length;x++) {
			a.add(s[x]);
			System.out.println(a.get(x)+"\n");
			
		}
	}

}
