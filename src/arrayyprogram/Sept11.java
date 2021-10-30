package arrayyprogram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Sept11 {
     public static void main(String[] args) {
		
		ArrayList<String> student=new ArrayList<String>();
		
		student.add("pavlo");
		student.add("dam");
		student.add("trifin");
		for(int i=0;i<student.size();i++)
		{
			System.out.println(student.get(i));
		}
		System.out.println("====");
		
		
		//for each loop
		for(String s:student)
		{
			System.out.println(s);
		}
		System.out.println("====");
		//iterator: iteraTor is an interface which is used to iterate the values from collections 
		
		
		Iterator<String> is=student.iterator();
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
		System.out.println("====");
		// list with other collections
		
		ArrayList<Integer> number=new ArrayList<Integer>(Arrays.asList(20,40,687,200));
		System.out.println(number);
		ArrayList<String> name=new ArrayList<String>(Arrays.asList("java","pithon","php"));
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(number.size());
        ArrayList<String> itye=new ArrayList<String>(Arrays.asList("hgh","tyfui","tydf"));
        System.out.println(itye);
	}

}
