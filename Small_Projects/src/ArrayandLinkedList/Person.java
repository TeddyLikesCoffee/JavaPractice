package ArrayandLinkedList;

public class Person {
	public String name;
	private int age;
	private double cash;
	
	Person(String name, int age, double cash){
		this.name=name;
		this.age=age;
		this.cash=cash;
	}
	
	public void setName(String name) {this.name=name;}
	public void setAge(int age) {this.age=age;}
	public void setCash(double cash) {this.cash=cash;}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getCash() {
		return this.cash;
	}
}