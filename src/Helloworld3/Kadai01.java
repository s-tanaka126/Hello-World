/*
 * [演習01]数値の入力を受け付け、入力された数値の数だけ、掛け算の表をコンソールに出力してください。
	　　　　　　例えば、15と入力されたら、 1×1～15×15までの掛け算の表を出力してください。
 */

package Helloworld3;
import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {

		// Scannerクラスのインスタントを作成し、引数を標準入力のSystem.inを指定す
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに「数字を入力してください)」を表示する
		System.out.println("数字を入力してください");

		// 入力された内容すべてをnew Scanner (System.in)から取得する
		int num = scanner.nextInt();
		
		int valLen = String.valueOf( num * num ).length() + 1; 
		
		//num_leftの初期値を1とし、最大値はnumとする
		for(int num_left = 1; num_left <= num ; num_left++) {
			
			//num_rightの初期値を1とし、最大値はnumとする
			for(int num_right = 1; num_right <= num; num_right++) {
				
				int num_kuku = num_left * num_right;
	
				System.out.printf("%" + valLen + "d", num_kuku);		
			
			}
			//コンソールに表示される値を改行する
			System.out.println();
		}
		// Scannerクラスのインスタンスをクローズする
		scanner.close();
   }

}
