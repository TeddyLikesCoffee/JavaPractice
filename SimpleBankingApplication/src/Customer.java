
public class Customer extends Person {
	private boolean maritalStatus;
	
	Customer(){}
	Customer(String firstName, String lastname,int age,String address,String state,int zipCode,boolean maritalStatus){
		super(firstName,lastname,age,address,state,zipCode);
		this.maritalStatus=maritalStatus;
	}
	public boolean getMaritalStatus() {return this.maritalStatus;}
	public void  setMaritalStatus(boolean status) {this.maritalStatus=status;;}
	public String toString() {
		if(maritalStatus==false) {
			return getFirstName()+" "+getLastName()+"\nMarital Status: Single";
		}else {
			return getFirstName()+" "+getLastName()+"\nMarital Status: Married";
		}
	}
}
