package print9_1.question06;

public class User {
	private int id;
	private String name;
	
	public User(int id, String name) {
		if(id < 0) {
			throw new  IllegalArgumentException("idが負の数です");
		}
		if(name == null || name.isEmpty()) {
			throw new IllegalArgumentException("nameがnullまたは空です");
		}
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "User[id =" + id + ",name=" + name + "]";
		
	}

}
