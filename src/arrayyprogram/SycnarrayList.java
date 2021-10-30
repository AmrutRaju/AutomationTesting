package arrayyprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SycnarrayList {
	public static void main(String[] args) {
		//CopyOnWrite ArrayList--its a class
		CopyOnWriteArrayList<String> employ =new CopyOnWriteArrayList<String>();
		employ.add("tom");
		employ.add("nn");
		employ.add("steev");
		employ.add("tf");
		employ.add("aref");
		//this is already thready safe 
		Iterator<String> it=employ.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		System.out.println("----");
		CopyOnWriteArrayList<String> emp=new CopyOnWriteArrayList<String>();
		emp.add("fjy");
		emp.add("hvuyj");
		emp.add("fxgh");
		emp.add("hgk");
		emp.add("gku");
		Iterator<String> ite=emp.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	

}
}