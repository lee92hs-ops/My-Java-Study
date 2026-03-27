package print6_1.question06;

import java.util.Random;

public class Main {
	public static String getWeatherMessage() {
		String[] days = {"今日", "明日", "明後日"};
		String[] weathers = {"晴れ", "曇り", "雨", "雪"};
		
		Random rand = new Random();
		
		String randomDay = days[rand.nextInt(days.length)];
		String randomWeather = weathers[rand.nextInt(weathers.length)];
		
		return randomDay + "の天気は" + randomWeather + "でしょう";
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String message = getWeatherMessage();
		System.out.println(message);

	}

}
