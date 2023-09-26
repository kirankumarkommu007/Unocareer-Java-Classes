class BankAccount{
	
	int accountNo;
	int balance;
	String name;
	
	
	public BankAccount(int accountNo, int balance, String name) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		
	System.out.println("New Account got Created on Name:"+name+" And with Opening Balance Amt:"+balance);
	}
	
	
	void depost(int amount) {
		
		this.balance = this.balance + amount;
		
		System.out.println(" Successfully deposited amount..."+amount);
		
	}
	
	void withDraw(int amt) {
		// 25000 > 10000
		if(amt > this.balance) {
			System.out.println("Insufficient Amount");
		}
		else {
			this.balance = this.balance - amt;
			System.out.println("Successfully withdrawn Amount--->"+amt);
			
		}
	}
	
	void checkBalance() {
		System.out.println("Avialable Amount----->"+this.balance);
	}
	
}
public class Bank {

	public static void main(String[] args) {
     BankAccount kiranAcc = new BankAccount(12354,50000,"Kiran");
		
		kiranAcc.checkBalance();
	
		kiranAcc.depost(3000);
		
		kiranAcc.checkBalance();
		
		kiranAcc.withDraw(2000);
		
		kiranAcc.checkBalance();
		kiranAcc.withDraw(3000);
		
	}

}
