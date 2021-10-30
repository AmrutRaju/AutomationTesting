package javaProgramm;

public class CallToThisAdvance {
	static int rollnumber;
	static String name;
	CallToThisAdvance(String name,int rollnumber )
	{
		this.rollnumber=rollnumber;
		this.name=name;
		
	}
	public static void info()
	{
		System.out.println("name="+name);
		System.out.println("rollnumber="+rollnumber);
	}
	public static void main(String[] args) {
		CallToThisAdvance ob1=new CallToThisAdvance("amrut",1101);
		ob1.info();
		
	}

}
  