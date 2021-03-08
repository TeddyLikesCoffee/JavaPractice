package PracticeArray;

public class Student extends CommunityMemeber {
	private final int MAX_NUM_OF_CLASSES=5;
	private int studentID;
	private int [] classID= {201,206,306,335};
	private double gpa;
	Student(){}
	Student(String fName,String lName, String address){
		super(fName,lName,address);
	}
	public void setClasses(int classID) {
		for(int x=0;x<MAX_NUM_OF_CLASSES-1;x++) {
			this.classID[x]=classID;
		}
	}
	public String getListOfClasses(){
		String listOfClasses="\n";
		for(int x=0;x<MAX_NUM_OF_CLASSES-1;x++) {
			listOfClasses+=this.classID[x]+"\n";
		}
		return listOfClasses;
	}
}
