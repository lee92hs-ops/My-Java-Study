package print12.questions01;


public class Main {

	public static void main(String[] args) {
		BankAccount[] bank = new BankAccount[4];
		
		bank[0] = new BankAccount("Bob", 100000);
		bank[1] = new BankAccount("Carol", 80000);
		bank[2] = new BankAccount("Alice", 90000);
		bank[3] = new BankAccount("Charlie", 1000);
		
		for(BankAccount ba : bank) {
			ba.displayAccountInfo();
		}
		bank[0].withdraw(5000);
		bank[3].withdraw(3000);
		bank[1].deposit(2000);
		bank[3].deposit(1000);
		

		BankAccount.transfer(bank[0], bank[1], 10000);
		
		BankAccount.transfer(bank[3], bank[2], 10000);
		
		for(BankAccount ba : bank) {
			ba.displayAccountInfo();
		}
	}
}
