package Helloworld;

import java.util.Scanner;
import java.util.Calendar;

public class Kadai05_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.println("����1�`12�œ��͂��Ă��������B(Enter�L�[�ŏI��)");
		
		String  inport_text = scanner.nextLine();//inport_text�ɏ������͂Ȃ����ߓ��͂������e�̂ݕ\�������
	
			Calendar cal = Calendar.getInstance();//���̑O��ɏ����������Ȃ���΂Ȃ�Ȃ��H
			
			int month = cal.get(Calendar.MONTH);//����0��1���ƂȂ邽�߁A�{���Ȃ��+1�H
				
		switch (month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(inport_text + "���́A" + 31 + "���ł��B");
			break;
		case 2:
			System.out.println(inport_text + "���́A" + 28 + "���ł��B");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(inport_text + "���́A" + 30 + "���ł��B");
			break;
	      default:
	    	System.out.println("���͂��Ԉ���Ă��܂��B");
	          break;
		}
		scanner.close();
	}
	
}
