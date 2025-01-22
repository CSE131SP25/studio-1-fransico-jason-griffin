package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Give year");
		int y = in.nextInt();
		boolean year400 = (y%400 == 0);
		boolean year100 = (y%100 != 0);
		boolean year4 = (y%4 == 0);
		boolean leapyear = year400 || (year4 && year100); 
		if (leapyear == true){
			System.out.print("It is a leap year");
		}
		else {
			System.out.print("Not a leap year");
		}
		
	}

}
