
public class CheckingAccount extends Account{
		private Object client;
		private double balance;
		CheckingAccount(){};
		//CheckingAccount(){};
		CheckingAccount(int routingNumber, int accountNumber, Customer client, double balance){
			super(routingNumber,accountNumber);
			this.client=client;
			this.balance=balance;
		}
		
		public void setClient(Object client) {
			this.client=client;
		}
		public boolean setBalance(double d) {
			if(d >=0) {
			 this.balance=d;
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
