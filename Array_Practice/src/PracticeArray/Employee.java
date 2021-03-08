package PracticeArray;

public class Employee extends CommunityMemeber{
	private int empId;
	private String employer;
	
	Employee(){}
	Employee(int id, String employer){
		this.empId=id;
		this.employer=employer;
	}
	public int getId() {return this.empId;}
	public String getEmployeer() {return this.employer;}
	
}
