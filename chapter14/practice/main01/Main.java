package sukkiri.chapter14.practice.main01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a1 = new Account("0001", 5000);
		Account a2 = new Account("0002", 14000);
		Account a3 = a1;
		Account a4 = new Account("0002", 222222);
		
		System.out.println(a1);
		System.out.println(a2);
		
		compare(a1, a2);
		compare(a1, a3);
		compare(a2, a4);
	}
	
	public static void compare(Account a1, Account a2) {
		if(a1.equals(a2)) {
			System.out.println("等価です");
		}else {
			System.out.println("等価ではないです");
		}
	}
	}
