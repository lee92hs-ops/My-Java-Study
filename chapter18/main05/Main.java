package sukkiri.chapter18.main05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import java.sql.Date;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc\"jdbc:postgresql://localhost:5432/";
		String user = "postgres";
		String password = "postgrestest";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Connection con = DriverManager.getConnection(url, user,password);
			Statement stmt = con.createStatment();){
			}
		String sql = "select * from 家計簿 where 出金額 >= " + 100;
		
		ResultSet result = stmt.executeQuery(sql);
		while(result.next()) {
			Date colDate = result.getDate("日付");
			String colItem = result.getString("費目");
			String colMemo = result.getString("メモ");
			int colDeposit = result.getInt("入金額");
			int colWithdrawal = result.getInt("出金額");
			System.out.println(df.format(colDate) + "." + colItem + "." + colMemo + ":" + colDeposit + ":" + colWithdrawal);
	
		 }
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
		
}	
