package javaProgramm;

public class CallToThisProgramm {
	public static void main(String[] args) {
		Case one =new Case('$');
		Case two=new Case(78);
		
		
	}

}
class Case
{
	public Case()
	{
		System.out.println("running zero constructor");
	}
	public Case(char arg)
	{
		this();
		System.out.println("running one constructor");
	}
	public Case(int i)
	{
		this();
		System.out.println("running two constructor");
	}
}
