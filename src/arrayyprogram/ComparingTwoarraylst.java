package arrayyprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparingTwoarraylst {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>(Arrays.asList("K","B","u","C","A"));
		ArrayList<String> arr1=new ArrayList<String>(Arrays.asList("U","B","K","C","A"));
		Collections.sort(arr);
		Collections.sort(arr1);
		System.out.println(arr.equals(arr1));//output==== False
		ArrayList<String> arr2=new ArrayList<String>(Arrays.asList("U","B","K","C","A"));
		Collections.sort(arr2);
		System.out.println(arr1.equals(arr2));
		ArrayList<Integer> aro=new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> aro1=new ArrayList<Integer>(Arrays.asList(1,2,3));
		Collections.sort(aro);
		Collections.sort(aro1);
		System.out.println(aro.equals(aro1));
		// find out the additional elements
		
		
		ArrayList<String> ar4=new ArrayList<String>(Arrays.asList("K","B","u","C","A"));

		ArrayList<String> ar5=new ArrayList<String>(Arrays.asList("K","B","u","C","T"));

		ar4.removeAll(ar5);
		System.out.println(ar4);
		
		System.out.println("----");
		//find out the missing elements
		
		ar5.removeAll(ar4);
		System.out.println(ar5 );
		System.out.println("-----");
		
		//find out common elements
		
		ArrayList<String> ar=new ArrayList<String>(Arrays.asList("Kabir","Babu","usha","kuku","Alok"));
		ArrayList<String>aar=new ArrayList<String>(Arrays.asList("Kabir","Babu","usha","Cutu","Alo"));
		Collections.sort(ar);
		Collections.sort(ar);
		ar.retainAll(aar);
		System.out.println(ar);
		

		


		
	}

}
