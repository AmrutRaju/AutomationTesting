package javaProgramm;

import java.util.Scanner;

public class UUsingForLoop {
	public static void main(String[] args) {
		for (;;) {
			int num;
			Scanner scn = new Scanner(System.in);
			System.out.println("enter a number");
			num = scn.nextInt();
			if (num % 2 == 0&&num!=0) {
				System.out.println("number is divisible by two");
			} else {
				System.out.println("number is not divisible ");
			}
			if(num == 0)
			System.exit(0);
		}
		
	}
}
