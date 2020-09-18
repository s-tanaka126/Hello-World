/*
 * [演習02]
 * 整数型の配列「numbers」を宣言して、{10,4,340,180,79}を代入してください。
 * また、配列の中から最大値をコンソールに表示するプログラムを作成してください。
 */


package Helloworld;

public class Kadai02 {

	public static void main(String[] ags) {
 
		//変数numbersの配列を宣言する
		int numbers[] = {10,4,340,180,79};
		
		//配列の最大値が0の場合もあるため、配列の要素の1番目で初期化する
        int max = numbers[0];
        
        //indexは1番目からとし、numbersの最大値までとする
        for(int index = 1 ;  index < numbers.length; index++){
        	
        	//Maxに代入されている値と配列の要素を比較する
            if(max < numbers[index]){
            	
            	//配列の要素のほうが大きい場合値を上書きする
                max = numbers[index];
                }
            }
        
            //上書きされた最大値を出力する、その際に文字列の「最大値は」と「です」を+する
            System.out.println("最大値は" +max +"です");
        }
    } 