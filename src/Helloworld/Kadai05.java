/*
 * [演習05]演習04のプログラムをつかって、月を表す文字列を入力して、その月の日数を表示する
 * プログラムを作成してください。
 * 2月は一律28日とします。
 * また、1~12以外が入力された場合には、”入力が間違っています。”と表示してください。
 */

package Helloworld;

import java.util.Scanner;

public class Kadai05 {

	public static void main(String[] args) {

		// Scannerクラスのインスタントを作成し、引数を標準入力のSystem.inを指定する
		Scanner scanner = new Scanner(System.in);

		// コンソールに「文字列を入力してください。(Enterキーで終了)」を表示する
		System.out.println("月を1～12で入力してください。(Enterキーで終了)");

		// 入力された内容すべてをnew Scanner (System.in)から取得する
		String month = scanner.nextLine();

		//monthの条件分岐の式
		switch (month) {
		//文字列のため""で囲い、1,3,5,7,8,10,12が条件の値
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			//処理された条件に"月は、" + 31 + "日です。"を結合し表示する
			System.out.println(month + "月は、" + 31 + "日です。");

			//処理の終了
			break;

		//文字列のため""で囲い、2が条件の値		
		case "2":
			//処理された条件に"月は、" + 28 + "日です。"を結合し表示する
			System.out.println(month + "月は、" + 28 + "日です。");

			//処理の終了
			break;
			
		//文字列のため""で囲い、4,6,9,11が条件の値			
		case "4":
		case "6":
		case "9":
		case "11":
			//処理された条件に"月は、" + 30 + "日です。"を結合し表示する
			System.out.println(month + "月は、" + 30 + "日です。");
			
			//処理の終了
			break;

		//1～12ではない値
		default:
			//1～12ではない値ないため"入力が間違っています。"と表示する
			System.out.println("入力が間違っています。");

			//処理の終了
			break;

		}
		// Scannerクラスのインスタンスをクローズする
		scanner.close();
	}

}
