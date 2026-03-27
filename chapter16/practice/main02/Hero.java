package sukkiri.chapter16.practice.main02;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	private String name;
	Hero h1 = new Hero("斎藤");
	Hero h2 = new Hero("鈴木");
	List<Hero>heroes = new ArrayList<Hero>();
	
	
	public Hero(String name) {
		super();
		this.name = name;
		heroes.add(h1);
		heroes.add(h2);
		for(Hero h : heroes) {
			System.out.println(h.getName());
		}
	}
	
	public String getName() {
		return name;
	}

}