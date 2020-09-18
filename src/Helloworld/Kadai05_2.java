package Helloworld;

import java.util.Scanner;
import java.util.Calendar;

public class Kadai05_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.println("月を1～12で入力してください。(Enterキーで終了)");
		
		String  inport_text = scanner.nextLine();//inport_textに条件式はないため入力した内容のみ表示される
	
			Calendar cal = Calendar.getInstance();//この前後に条件式を入れなければならない？
			
			int month = cal.get(Calendar.MONTH);//月は0が1月となるため、本来ならば+1？
				
		switch (month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(inport_text + "月は、" + 31 + "日です。");
			break;
		case 2:
			System.out.println(inport_text + "月は、" + 28 + "日です。");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(inport_text + "月は、" + 30 + "日です。");
			break;
	      default:
	    	System.out.println("入力が間違っています。");
	          break;
		}
		scanner.close();
	}
	
}
