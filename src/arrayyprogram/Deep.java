package arrayyprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Deep {
public static void main(String[] args) {
	ArrayList<Object> ar=new ArrayList<Object> (20);
	ar.add(67589);
	ar.add(769);
	ar.add("object");
	System.out.println(ar);
	System.out.println(ar.size());
	ar.add(98789);
	ar.add(476);
	System.out.println(ar.size());
	ArrayList<String >student=new ArrayList<String>();
	student.add(null);
	student.add("rim");
	student.add("pabi");
	student.add("surur");
	for(int i=0;i<student.size();i++)
	{
		System.out.println(student.get(i));
	}
	System.out.println("-----");
	for(String s:student)
	{
		System.out.println(s);
	}
	System.out.println("----");
	Iterator<String> it=student.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("-----");
	ArrayList<String> ar1=new ArrayList<String>();
	ar1.add("rdty");
	ar1.add("gtfuy");
	ar1.add("fdy");
	ArrayList<String> ar2=new ArrayList<String>();
	ar2.add("fgduy");
	ar2.add("tfuy");
	ar1.addAll(ar2);
	System.out.println(ar1);
	ar1.addAll(2, ar2);
	System.out.println(ar1);
	//ar1.clear();
	ArrayList<String> ar0=new ArrayList<String>(Arrays.asList("naven","priti","kyro"));
	System.out.println(ar0);
	ArrayList<Integer> num8=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
System.out.println(num8);	
ArrayList<String> name=new ArrayList<String>(Arrays.asList("java","pithon","js","php"));
System.out.println(name);
System.out.println(name.size());
ArrayList<String> list1=new ArrayList<String>(Arrays.asList("naven","priti","kyro"));
list1.remove(1);
System.out.println(list1);
list1.remove("naven");
System.out.println(list1);
ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
number.removeIf(num->num%2==0);
System.out.println(number);
ArrayList<Integer> inter=new ArrayList<Integer>(Arrays.asList(1,2,4,6,8,3,5,5,13,534,6,35636,56,25,62,316776,976));
inter.removeIf(num->num%2==1);
System.out.println(inter);

ArrayList<String> list2=new ArrayList<String>(Arrays.asList("naven","priti","kyro","naveen","kyro"));
int i=list2.lastIndexOf("kyro");
System.out.println(i);
list2.remove(3);
System.out.println(list2);
list2.remove("kyro");
System.out.println(list2);
ArrayList<Integer> intt=new ArrayList<Integer>(Arrays.asList(1,2,4,6,8,3,5,5,13,534,6,35636,56,25,62,316776,976));
intt.removeIf(num->num%2==0);
System.out.println(intt);
ArrayList<String> list3=new ArrayList<String>(Arrays.asList("naven","priti","kyro","naveen","kyro","naven","pag"));
list3.retainAll(Collections.singleton("kyro"));
System.out.println(list3);
ArrayList<Integer> intter=new ArrayList<Integer>(Arrays.asList(1,2,4,6,8,3,5,5,13,534,6,35636,56,25,62,316776,976,543,879));
ArrayList<Integer> sublist=new ArrayList<Integer>(intter.subList(0, 14));
System.out.println(sublist);
ArrayList<String> list4=new ArrayList<String>(Arrays.asList("naven","priti","kyro","naveen","kyro","naven","pag"));
Object arr[]=list4.toArray();
System.out.println(Arrays.toString(arr));
for(Object ob:arr) {
	System.out.println(ob);
}

	
	
}
}
