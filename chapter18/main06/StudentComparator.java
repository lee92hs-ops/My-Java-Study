package sukkiri.chapter18.main06;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		return s1.getScore() - s2.getScore();
	}

}
