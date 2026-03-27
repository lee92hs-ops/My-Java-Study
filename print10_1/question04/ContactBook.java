package print10_1.question04;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class ContactBook {
	
private ArrayList<Person> list;
	
	ContactBook(){
		list = new ArrayList<Person>();
	}
	
	public boolean entryPerson(String name,String tel) {
		//名前の未入力チェック
		if(!chkInput(name)) {
			System.out.println("名前が未入力もしくは空白です");
			return false;
		}
		//名前の重複チェック
		if(!chkName(name)) {
			System.out.println("既に登録されている名前です");
			return false;
		}
		//電話番号の未入力チェック
		if(!chkInput(tel)) {
			System.out.println("電話番号が未入力もしくは空白です");
			return false;
		}
		
		//電話番号チェック
		if(!chkTel(tel)) {
			System.out.println("電話番号が正しくありません");
			return false;
		}
		
		createPerson(name,tel);
		
		return true;
	}
	
	public void createPerson(String name,String tel) {
		list.add(new Person(name,tel));
	}
	
	/*
	 * 機能：引数の値がnullもしくは空白のチェック
	 * 引数：入力文字列
	 * 戻り値：true,false　/　boolean
	 */
	public boolean chkInput(String str) {
		if(str == null || str.trim().isEmpty() || str.replaceAll("[\\s　]", "").isEmpty()) {
			return false;
		}
		return true;
	}
	
	public boolean chkTel(String tel) {
		String pattern = "^\\d{2,4}-\\d{2,4}-\\d{4}$";
		Pattern p = Pattern.compile(pattern);
		if(p.matcher(tel).find()) {
			return true;
		}
		return false;
	}
	
	public void getPersonList(){
		for(Person p : list) {
			System.out.println(p.getName());
			System.out.println(p.getTel());
		}
	}
	
	public String getTel(String name) {
		for(Person p : list) {
			if(p.getName().equals(name)) {
				return p.getTel();
			}
		}
		
		return "登録されていない人物です";
	}
	
	public boolean chkName(String name) {
		for(Person p : list) {
			if(p.getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
	
	public int getListSize() {
		return list.size();
	}

}
