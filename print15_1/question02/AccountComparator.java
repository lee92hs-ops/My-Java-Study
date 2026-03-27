package print15_1.question02;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account>{
	
	public int compare(Account o1, Account o2) {
		if(o1.getBalance() > o2.getBalance()) {
			return 1;
		}else if(o1.getBalance() < o2.getBalance()) {
			return -1;
		}else {
			return 0;
		}
	}
}
	
