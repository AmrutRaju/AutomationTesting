package arrayyprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class O1Sept11 {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("jgk");
		ar.add("uygku");
		ar.add("ygku");
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("uighi");
		ar1.add("iuhli");
		ar1.add("hkhl");
		System.out.println("-----");
		ar.addAll(ar1);
		System.out.println(ar);
		ar1.addAll(ar);
		System.out.println(ar1);
		ar.addAll(2, ar1);
		System.out.println(ar);
		//ar1.clear();
		System.out.println(ar1);
		System.out.println(ar.contains("jgk"));
		System.out.println(ar.contains("jg"));
		ArrayList<String> art=new ArrayList<String>(Arrays.asList("ug","tfiug","hgvku"));
		System.out.println(art);
		int i=art.lastIndexOf("hgvku");
		System.out.println(i);
		art.remove(1);
		System.out.println(art);
		art.remove("ug");
		System.out.println(art);
		
		
		
		System.out.println("--------");
		//remove all even numbers
		ArrayList<Integer> inte=new ArrayList<Integer>(Arrays.asList(2,345,3,74));
		inte.removeIf(num->num%2==0);
		System.out.println(inte);
		ArrayList<Integer> inter =new ArrayList<Integer>(Arrays.asList(435,85,4375,688,893465,48,026,658));
		inter.removeIf(num->num%2==0);
		System.out.println(inter);
		
		
		
		//print  all even number
		ArrayList<Integer> enter=new ArrayList<Integer>(Arrays.asList(97,689,91234,689,92387,92347,568324,2556,23,97));
		enter.removeIf(num->num%2==1);
		System.out.println(enter);
		//retainall
		System.out.println("------");
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("tom","harry","yadav","tom"));
		System.out.println(names);
		names.retainAll(Collections.singleton("tom"));
		System.out.println(names);
		
		
	}

}
