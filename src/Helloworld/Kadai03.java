/*
 * [演習03]コンソールに九九の表を表示してください。表示は見栄え良く桁を揃えてください。
 */

package Helloworld;

public class Kadai03 {

	public static void main(String[] args) {
		
		//leftの初期値を1とし、最大値は9までとする
		for(int left = 1; left <= 9; left++) {
			
			//rightの初期値を1とし、最大値は9までとする
			for(int right = 1; right <= 9; right++) {
			
				//leftとrightの計算された値を3桁で表示する
				System.out.printf("%3d",left * right);
			}
			//コンソールに表示される値を改行する
			System.out.println();
		}
	}

}
