package Helloworld;

import java.util.Scanner;
import java.util.Calendar;

class jiken02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("”N‚ğ“ü—Í: ");
		int year = scan.nextInt();
		System.out.println("Œ‚ğ“ü—Í: ");
		int month = scan.nextInt();
		
		System.out.println(year + "”N" + month + "Œ");
		System.out.println(" “ú Œ ‰Î … –Ø ‹à “y");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		
		//‚»‚ÌŒ‚ÌÅI“ú
		int max_day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//1“ú‚Ì—j“ú
		int start_index = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < start_index; i++) {
			System.out.printf("%3s", ""); //1T–Ú‚Ì1“ú‚Ü‚Å‚ğ‹ó”’‚Å–„‚ß‚é
		}
		
		for (int i = 1; i <= max_day; i++) {
			System.out.printf("%3d", i);
			cal.set(Calendar.DATE, i);
			if (Calendar.SATURDAY == cal.get(Calendar.DAY_OF_WEEK)) {
				System.out.println("");
			}
		}
	}
}