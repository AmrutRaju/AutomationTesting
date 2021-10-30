package javaProgramm;

public class AreaOfCircle {
	
		static double pie=3.14d;
		static double r=2.68;
		static double w=5.78;
		public static void AreaOfCircle()
		{
		double area=pie*r*r;
		System.out.println(area);
		}
		public static void CircumferenceOfCircle()
		{
			double circumference=2*pie*r;
			System.out.println(circumference);
		}
		public static void DiameterOfCircle()
		{
			double diameter=2*r;
			System.out.println(diameter);
		}
		public static void  AreaOfRectangle()
		{
			double rectangle=r*w;
			System.out.println(rectangle);
		}
		
		public static void main(String[] args) {
			AreaOfCircle();
			CircumferenceOfCircle();
			DiameterOfCircle();
			AreaOfRectangle();
			
			
		}
}
