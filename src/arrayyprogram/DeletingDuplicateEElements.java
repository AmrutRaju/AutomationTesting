package arrayyprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DeletingDuplicateEElements {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> numbersss=new ArrayList<Integer>(Arrays.asList(1,3,5,67,8,37,4,3,8,987,37,86,16,85,62,91,62));
	
	//linked hash set
	
	LinkedHashSet<Integer> pum=new LinkedHashSet<Integer>(numbersss);
	ArrayList<Integer> numlistwithoutDup =new ArrayList<Integer>(pum);
	System.out.println(numlistwithoutDup);
	
	//jdk 8-steam:
	//ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,3,5,67,8,37,4,3,8,987,37,86,16,85,62,91,62));
	
	 
}
}
