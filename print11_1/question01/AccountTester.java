package print11_1.question01;

public class AccountTester {
	
	private static int compBalance(Account a, Account b) {
		if(a.getBalance() > b.getBalance()) {
			return 1;
		}else if(a.getBalance() < b.getBalance()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Account nobita = new Account("のび太", 12345,30000);
		TimeAccount suneo = new TimeAccount("スネ夫", 33333,20000,100000);
		Account doraemon = new Account("ドラえもん", 99999, 50000);
		
		nobita.show();
		suneo.show();
		doraemon.show();
		
		switch(compBalance(nobita,suneo)) {
		case 0:System.out.println("のび太とスネ夫の普通預金残高は同じ");break;
		case 1:System.out.println("のび太の方が普通預金残高が多い");break;
		case -1:System.out.println("スネ夫の方が普通預金残高が多い");break;
		}
		
		suneo.cancel();
		doraemon.transfer(nobita,20000);
		
		switch(compBalance(nobita,suneo)) {
		case 0:System.out.println("のび太とスネ夫の普通預金残高は同じ");break;
		case 1:System.out.println("のび太の方が普通預金残高が多い");break;
		case -1: System.out.println("スネ夫のほうが普通預金残高が多い");break;
		}
		
		nobita.show();
		suneo.show();
		doraemon.show();
	}

}
