package javaProgramm;

public class AddFirstFiveNaturalNumber {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=i+sum;
			
		}
		System.out.println(sum);
	}

}
