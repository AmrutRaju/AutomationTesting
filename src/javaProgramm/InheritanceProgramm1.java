package javaProgramm;

public class InheritanceProgramm1 {
	public static void main(String[] args) {
		value val = new value();
		System.out.println("x=" + val.x);
		val.display();
		value1 v = new value1();
		System.out.println("y=" + v.y);
		System.out.println("x=" + v.x);
		v.dis();

		/* Mo  java */

	}

}

class value {
	int x = 56;

	public void display() {
		System.out.println("have to print this value");

	}

}

class value1 extends value {
	int y = 687;

	public void dis() {
		System.out.println("print the value");
	}
}

