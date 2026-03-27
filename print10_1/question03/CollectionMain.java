package print10_1.question03;

import java.util.ArrayList;

public class CollectionMain {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("Bob",14,0));
		list.add(new Person("Alice",15,1));
		list.add(new Person("Carol",13,1));
		list.add(new Person("Charlie",15,0,"サイクリング"));
	
		for(int i=0;i<list.size();i++) {
			if(list.get(i).hasSameName("Carol")) {
				list.remove(i);
				i--;
			}
		}
		
		list.remove(0);
		
		for(Person p : list) {
			p.show();
		}
	}

}