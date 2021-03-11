
public abstract class Account {
	private int routingNumber=000045670;
	private int accountNumber=54285070;
	Account(){}
	Account(int routingNumber, int accountNumber ){
		this.routingNumber=routingNumber;
		this.accountNumber=accountNumber;
	}
	public void setRoutingNum(int routingNumber) {
		routingNumber+=1;
	};
	public void setRoutingNum() {
		routingNumber+=1;
	}
	public void setAccountNumber() {
		accountNumber+=1;
	}
	public int getRoutingNum() {return routingNumber;}
	public int getAccountingNum() {return accountNumber;}
	public String toString() {
		return "";
	}
		
}
