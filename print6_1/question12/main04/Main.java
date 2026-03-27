package print6_1.question12.main04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Aさんの代金"+ getTicketPrice(23, "男性", 1, "火"));
		System.out.println("Bさんの代金"+ getTicketPrice(30, "女性", 6, "水"));
		System.out.println("Cさんの代金"+ getTicketPrice(62, "女性", 25, "水"));
		System.out.println("Dさんの代金"+ getTicketPrice(19, "男性", 5, "土"));
		System.out.println("Eさんの代金"+ getTicketPrice(46, "男性", 18, "月"));
	}
	
	public static int getTicketPrice(int age, String gender, int day, String dayOfWeek) {
		if(day == 1) {
			return 1200;
		}
		
		if((day == 5 || day == 15 || day == 25) && age >= 60) {
			return 1000;
		}
		
		if(dayOfWeek.equals("月") && gender.equals("男性")) {
			return 1500;
		}
		return 2000;
	}

}
