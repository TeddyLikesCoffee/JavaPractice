
public class CheckingAccount extends Account{
		//private Customer client;
		private Object client;
		private double balance;
		
		CheckingAccount(int routingNumber, int accountNumber, Customer client, double balance){
			super(routingNumber,accountNumber);
			this.client=client;
			this.balance=balance;
		}
		
		public boolean setBalance(int balance) {
			if(balance >=0) {
			 this.balance=balance;
			 return true;
			}else {
				return false;
			}
		}
		public void addBalance(double amount) {
			balance=balance+amount;
		}
		public boolean withdrawl(double amount) {
			if(balance > 0) {
				balance=balance-amount;
				return true;
			}else {
				return false;
			}
		}
		public Object getClientInfo() {
			return this.client;
		}
		public String toString() {
			return "\nUser information\n\n"+client.toString()+"\nBalance: "+balance;
		}
}
