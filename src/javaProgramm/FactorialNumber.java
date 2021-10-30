package javaProgramm;

public class FactorialNumber {
	public static void main(String[] args) {
		int i = 1;
		int fact = 1;
		while (i <= 6) {
			fact=fact*i;
			i++;

		}
		System.out.println("factorial="+fact);
	}

}
