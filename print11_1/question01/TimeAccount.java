package print11_1.question01;

public class TimeAccount extends Account{
	private int timeBalance;
	
	public TimeAccount(String name, int no, int balance, int timeBalance) {
		super(name, no, balance);
		setTimeBalance(timeBalance);
	}
	
	public int getTimeBalance() {
		return timeBalance;
	}
	
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	
	public void cancel() {
		deposit(timeBalance);
		setTimeBalance(0);
	}
	
	public void show() {
		super.show();
		System.out.println("口座名義:" + getName());
		System.out.println("口座番号:" + getNo());
		System.out.println("普通預金残高:" + getBalance());
		System.out.println("定期預金残高:" + getTimeBalance());
	}

}
