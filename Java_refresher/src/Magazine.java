
public class Magazine {
	private String title;
	private double cost;
	private int numInStock;
	
	Magazine(){
		this.title=null;
		this.cost=3.50;
		this.numInStock=10;
	}
	Magazine(String title, double cost,int numInStock){
		this.title=title;
		this.cost=cost;
		this.numInStock=numInStock;
	}
	
	public String getTitle() {return this.title;}
	public double getCost() {return this.cost;}
	public int getNumInStock() {return this.numInStock;}
	
	public void setTitle(String title) {this.title=title;}
	public void setCost(double cost) {this.cost=cost;}
	public void setNumInStock(int numInStock) {this.numInStock=numInStock;}
	
	public boolean sellOne() {
		if(numInStock > 0) {
			numInStock--;
			return true;
		}else {
			return false;
		}
	}
	public double total(double saleTax) {
		return (saleTax*cost)+cost;
		}
}
