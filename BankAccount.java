package day1;

public class BankAccount {
	int balance;
	BankAccount(){
		
	}
	
	
	  BankAccount(int balance){ this.balance=balance; }
	 
	public void addBalance(int amount) {
		balance=balance+amount;
	}
	
	public void withdrawBalance(int amount) {
		balance=balance-amount;
	}
	public void showBalance() {
		System.out.println(balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount vikasAccount = new BankAccount();
		BankAccount snehaAccount = new BankAccount(10);
		BankAccount avyayAccount = new BankAccount(100);
		System.out.println("=========Vikas Balance=======");
		//vikasAccount.addBalance(10);
		vikasAccount.showBalance();
		System.out.println("=========Sneha Balance=======");
		snehaAccount.withdrawBalance(10);
		snehaAccount.showBalance();
		
		System.out.println("=========Avyay Balance=======");
		avyayAccount.withdrawBalance(100);
		avyayAccount.showBalance();
	}

}
