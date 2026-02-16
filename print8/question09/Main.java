package print8.question09;

import java.util.ArrayList;
import java.util.Scanner;

//class Person{
//public String name;//名前
//public int age;//年齢
//public int height;//身長
//}
//(1)上記のPersonクラスをP639のコード16-8を参考にMainクラスの上に記述してください。
//class Person{
//	public String name;//名前
//	public int age;//年齢
//	public int height;//身長
//}


public class Main {


//メソッド名： main
//引数：String[] args
//戻り値：void
//処理の内容： 
//1.	ArrayListをPerson型で宣言する。
//2.	「作成したい人数を指定してください」と表示後、キーボードから整数値nを入力させる。
//3.	createPersonメソッドを呼び出し、引数にArrayListと、変数nの値を渡す。
//4.	showPersonメソッドを呼び出し、引数にArrayListを渡す
	public static void main(String[] args) {
		//1
		ArrayList<Person> plist = new ArrayList<Person>();
		//2
		System.out.println("作成したい人数を指定してください");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//3
		createPerson(plist,n);
		//4
		showPerson(plist);
	}
//
//
//メソッド名： createPerson
//引数：ArrayList<Person> , int
//戻り値：void
//処理の内容： Personのデータを作成し、ArrayListに追加するメソッド
//1.	引数で受け取ったint型の値の回数でfor文を作る(以下はループの中の処理内容)
//2.	Personクラスを変数名pとして宣言する
//（Ｐ６３９のコード16-8の９行目のようなnewすることを宣言するという）
//3.	「名前を入力してください」と表示後、キーボードから入力を行う。
//4.	「年齢を入力してください」と表示後、キーボードから入力を行う。
//5.	「身長を入力してください」と表示後、キーボードから入力を行う。
//6.	上記2で宣言した変数pに名前、年齢、身長を代入する
//7.	上記2で宣言した変数pをArrayListに追加する
//※変数pのnameに値を代入する場合は「p.name = (3.で入力した名前)」のように書く
	public static void createPerson(ArrayList<Person> list,int n) {
		Scanner sc = new Scanner(System.in);
		//1
		for(int i=0;i<n;i++) {
			//2
			Person p = new Person();
			//3
			System.out.print("名前を入力してください");
			String name = sc.nextLine();
			//4
			System.out.print("年齢を入力してください");
			int age = Integer.parseInt(sc.nextLine());
			//5
			System.out.print("身長を入力してください");
			int height = Integer.parseInt(sc.nextLine());
			//6
			p.name = name;
			p.age = age;
			p.height = height;
			//7
			list.add(p);
		}
		
	}
//		　　　
//メソッド名： showPerson
//引数：ArrayList<Person>
//戻り値：void
//処理の内容：
//1.	引数で渡されたArrayListをループさせ、順番にPersonクラスの中身を表示していく。
//2.	名前は、「リスト変数名.get(インデックス).name」で表示できる。
//年齢は、「リスト変数名.get(インデックス).age」で表示できる。
//身長は、「リスト変数名.get(インデックス).height」で表示できる。
	public static void showPerson(ArrayList<Person> list) {
		//1
		for(int i=0;i<list.size();i++) {
			System.out.println("名前：" + list.get(i).name);
			System.out.println("年齢：" + list.get(i).age);
			System.out.println("身長：" + list.get(i).height);
		}
	}

}
