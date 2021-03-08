
public class Department {
	 private Student students [];
	 private String name;
	 private static final int MAX_SIZE = 2;
	Department(){
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {return this.name;}
	/*public String toString() {
		String info="\n";
		for(int x=0;x<MAX_SIZE; x++) {
			info+=students[x]+"\n";
		}
		return info;
	}*/
	
	public String toString(Student [] s) {
		String info="\n";
		for(int x=0;x<MAX_SIZE; x++) {
			info+=s[x]+"\n";
		}
		return info+" "+getName();
	}
}
