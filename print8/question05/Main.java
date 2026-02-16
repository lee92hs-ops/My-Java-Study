package print8.question05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random rand = new Random();
		while(true) {
			set.add(rand.nextInt(100));
			if(set.size() == 24) {
				break;
			}
		}

		int count = 1;
		for(int i : set) {
			System.out.printf("%3d",i);
			
			if(count % 5 == 0) {
				System.out.println();
			}
			
			if(count == 12) {
				System.out.printf("%2s","☆");
				count++;
			}
			count++;
		}
	}

}
