import javax.swing.JOptionPane;
public class AggregationPractice {

	public static void main(String [] args) {
		int MAX=2;
		//Student s=new Student("Miriam Pantoja",1234,"Technology");
		Student[] s = new Student[MAX];
		Department d=new Department();
		
		for(int x=0;x < MAX; x++) {
			s[x]=new Student(JOptionPane.showInputDialog("Name: "),
					Integer.parseInt(JOptionPane.showInputDialog(null,"ID: ")),
					JOptionPane.showInputDialog("Department: "));
			//System.out.println(s[x].toString());
			
		}
		d.setName(JOptionPane.showInputDialog("Department Name: "));
		System.out.println(d.toString(s));
		
	}
}
