package javaProgramm;

public class ConstructOverLoading {
	public ConstructOverLoading(int i)
	{
		System.out.println("first constructor");
	}
	public ConstructOverLoading(char ch)
	{
		System.out.println("charactor overloading");
	}
	public ConstructOverLoading(double d)
	{
		System.out.println("double constructor");
	}
	public ConstructOverLoading(int x,double y)
	{
		System.out.println("int and double overloading");
	}
	public ConstructOverLoading(double x,int y)
	{
		System.out.println("double and int overloading");
	}
	

}
class Main{
	public static void main(String[] args) {
		ConstructOverLoading con=new ConstructOverLoading(7);
		ConstructOverLoading con1=new ConstructOverLoading(6,78.65);
		ConstructOverLoading con2=new ConstructOverLoading('$');
		ConstructOverLoading con3=new ConstructOverLoading(68.68967);
		ConstructOverLoading con4=new ConstructOverLoading(934.576,8);
		
	}
}
