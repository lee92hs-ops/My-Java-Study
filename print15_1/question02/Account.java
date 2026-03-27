package print15_1.question02;

public class Account {
	
	private int accountNum;
	private String name;
	private int balance;
	
	public Account(int accountNum, String name, int balance) {
		setAccountNum(accountNum);
		setName(name);
		setBalance(balance);
		
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
