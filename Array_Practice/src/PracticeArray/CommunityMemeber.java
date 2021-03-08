package PracticeArray;

public class CommunityMemeber {
	private String fName;
	private String lName;
	private String address;
	
	CommunityMemeber(){
		
	}
	CommunityMemeber(String firstName, String lastName, String address){
		this.fName=firstName;
		this.lName=lastName;
		this.address=address;
		
	}
	
	public String getFirstName() {return fName;}
	public String getLastName() {return lName;}
	public boolean setFirstName(String fName){
		if(!fName.equals(null)) {
			this.fName=fName;
			return false;
		}else {
			return true;
		}
	}
	public boolean setLastName(String lName){
		if(!lName.equals(null)) {
			this.lName=lName;
			return false;
		}else {
			return true;
		}
	}
	
}
