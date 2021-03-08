package PracticeArray;
import java.io.*;
public class InherritancePracticeMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(66690,"Petco");
		employee.setFirstName("Nelly");
		employee.setLastName("Pantoja");
		System.out.println("\n"+employee.getFirstName()
			+" "+employee.getLastName()+"\nEmployee ID: "
			+employee.getId()
			+"\nEmployeer : "+employee.getEmployeer());
		
		/*Student student= new Student("Miriam","Pantoja","Fake Address");
		System.out.println("\n"
		+"Student Name: "+student.getFirstName()+" "+student.getLastName()
		+"\nList of classes: "+student.getListOfClasses()); 
		*/
		
		//downCasting example
		CommunityMemeber student= new Student("Miriam","Pantoja","Fake Address");
		System.out.println("\n"
				+"Student Name: "+student.getFirstName()+" "+student.getLastName()
				+"\nList of classes: "+((Student)student).getListOfClasses()); 
	}

}
