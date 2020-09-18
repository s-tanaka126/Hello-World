/*
 * [演習04]キーボードから読み込んだ文字列を出力するプログラムを作成してください。
 *        入力にはやり方がありますが、Scannerを利用してください。
 */

package Helloworld;

import java.util.Scanner;

public class Kadai04 {

	public static void main(String[] args) {

		// Scannerクラスのインスタントを作成し、引数を標準入力のSystem.inを指定する
		Scanner scanner = new Scanner(System.in);

		// コンソールに「文字列を入力してください。(Enterキーで終了)」を表示する
		System.out.println("文字列を入力してください。(Enterキーで終了)");

		// 入力された内容をnew Scanner (System.in)から取得する
		String inport_text = scanner.nextLine();

		// 入力された内容に ＋ 「入力されました」と結合し、コンソールに表示する
		System.out.println(inport_text + "と入力されました");

		// Scannerクラスのインスタンスをクローズする
		scanner.close();

	}

}
