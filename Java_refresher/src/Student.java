
public class Student {
	private String name;
	private int id;
	private String dept;
	Student(){};
	Student(String name,int id, String dept){
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	public void setName(String name) {this.name=name;}
	public void setID(int id) {this.id=id;}
	public void setDept(String dept) {this.dept=dept;}
	
	public String toString() {
		return "\nName: "+this.name+"\nID: "+this.id+"\nDepartment: "+this.dept+"\n\n";
	}
}
