/*
 * [���K01]
 * 1����30�܂ŏ��Ԃɐ����R���\�[���ɕ\�����Ă��������B
 * �������A���̐���3�Ŋ���؂��Ȃ�"Fizz"�A5�Ŋ���؂��Ȃ�"Buzz"�A
 * �����Ŋ���؂��Ȃ�"Fizzbuzz"�ƕ\�����Ă��������B
 */

package Helloworld;

public class Kadai01 {

	public static void main(String[] args) {
 
		/*number�̏����l��1�Ƃ��A30�܂łƂ���*/ 
		for(int number =1 ; number <= 30 ; number++) {

			/*number�̒l��3�Ŋ���]�肪0�̒l��5�Ŋ���]�肪0�̒l��FizzBuzz�Əo�͂���*/ 
			if(number % 3 == 0 && number % 5 == 0) {
			    System.out.println("FizzBuzz");

			/*number�̒l��3�Ŋ���]�肪0�̒l��Fizz�Əo�͂���*/    
			}else if(number % 3 == 0){
			    System.out.println("Fizz");
			    
			/*number�̒l��5�Ŋ���]�肪0�̒l��Buzz�Əo�͂���*/ 
			}else if(number % 5 == 0){
				System.out.println("Buzz");

			/*number�̒l��3��5�Ŋ���]��0�ȊO�̒l���o�͂���*/
			}else{
				System.out.println(number);
			}	
        }
   }   
}

