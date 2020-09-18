package Helloworld;

import java.util.Scanner;

public class Kadai06 {

	public static void main(String[] args) {

		// Scannerクラスのインスタントを作成し、引数を標準入力のSystem.inを指定する
		Scanner scanner = new Scanner(System.in);

		// コンソールに「文字列を入力してください。(Enterキーで終了)」を表示する
		System.out.println("月を1～12で入力してください。(Enterキーで終了)");
		
		int month = 1 ;


		//monthの条件分岐の式
		while (month < 13) {
			// 入力された内容すべてをnew Scanner (System.in)から取得する
			month = scanner.nextInt();

		//処理された条件に"月は、" + 31 + "日です。"を結合し表示する
		System.out.println(month + "月は、" + 31 + "日です。");		

		break;
		
		}
		
		System.out.println("入力が間違っています。再入力してください");
		

		// Scannerクラスのインスタンスをクローズする
		scanner.close();


	}
		


}