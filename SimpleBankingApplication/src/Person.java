
public abstract class Person {
	private String firstName;
	private String lastname;
	private int age;
	private String address;
	private String state;
	private int zipCode;

	Person(){}
	Person(String firstName, String lastname,int age,String address,String state,int zipCode){
		this.firstName=firstName;
		this.lastname=lastname;
		this.age=age;
		this.address=address;
		this.state=state;
		this.zipCode=zipCode;
	}
	public void setFirstName(String firstName) {this.firstName=firstName;}
	public void setLastName(String lastname) {this.lastname=lastname;}
	public void setAge(int age) {this.age=age;}
	public void setAddress(String address) {this.address=address;}
	public void setState(String state) {this.state=state;}
	public void setZipCode(int zipCode) {this.zipCode=zipCode;}
	
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastname;}
	public int getAge() {return age;}
	public String getAddress() {return address;}
	public String getState() {return state;}
	public int getZipCode() {return zipCode;}
	
	public String toStringPerson() {
		return firstName+" "+lastname;
	}
}
