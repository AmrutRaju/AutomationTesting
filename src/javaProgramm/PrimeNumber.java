package javaProgramm;

import java.util.Scanner;

public class PrimeNumber {
	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * int pri; Scanner scn = new Scanner(System.in);
		 * System.out.println("enter a number"); int number = scn.nextInt(); for (int i
		 * = number; i <= number; i++) { if (i % number == 0) {
		 * System.out.println(number); } }
		 */

		int i, m = 0, flag = 0;
		System.out.println("Please a number to be checked for prime number");
		sc = new Scanner(System.in);
		int n = sc.nextInt();// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
			}
		} // end of else

	}
}