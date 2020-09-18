/*
 * [演習01]
 * 1から30まで順番に数をコンソールに表示してください。
 * ただし、その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、
 * 両方で割り切れるなら"Fizzbuzz"と表示してください。
 */

package Helloworld;

public class Kadai01 {

	public static void main(String[] args) {
 
		/*numberの初期値を1とし、30までとする*/ 
		for(int number =1 ; number <= 30 ; number++) {

			/*numberの値が3で割り余りが0の値と5で割り余りが0の値はFizzBuzzと出力する*/ 
			if(number % 3 == 0 && number % 5 == 0) {
			    System.out.println("FizzBuzz");

			/*numberの値が3で割り余りが0の値はFizzと出力する*/    
			}else if(number % 3 == 0){
			    System.out.println("Fizz");
			    
			/*numberの値が5で割り余りが0の値はBuzzと出力する*/ 
			}else if(number % 5 == 0){
				System.out.println("Buzz");

			/*numberの値が3と5で割り余り0以外の値を出力する*/
			}else{
				System.out.println(number);
			}	
        }
   }   
}

