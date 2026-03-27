package print15_1.question01;

public class Account implements Comparable<Account>{
	
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
	
	public int compareTo(Account o) {
		//System.out.println(getName() + ":" + o.getName());
		//return this.getBalance() - o.getBalance();
		
		if(this.getBalance() < o.getBalance()) {
			return  -1;
		}else if(this.getBalance() > o.getBalance()) {
			return 1;
		}else {
			return 0;
		}
	}

}
