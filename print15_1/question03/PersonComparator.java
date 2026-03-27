package print15_1.question03;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	
	private int select = 0;
	
	
	public PersonComparator(int select) {
		this.select = select;
	}
	
	public int compare(Person o1, Person o2) {
		if(select == 0) {
			return o1.getName().compareTo(o2.getName());
		}else if(select == 1) {
			return Integer.compare(o1.getAge(), o2.getAge());
		}else if(select == 2) {
			return Integer.compare(o1.getHeight(), o2.getHeight());
		}else {
			return Integer.compare(o1.getWeight(), o2.getWeight());
		}
	}
	
	

}
