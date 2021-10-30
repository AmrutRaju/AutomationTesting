package mapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ComparisuionInHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(4, "rtdfyt");
		map1.put(67, "gvy");
		map1.put(46, "trfy");
		System.out.println(map1.get("gvy"));
		map1.forEach((v,k)->System.out.println("key="+v+"value="+k));
		
		
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(8, "hgfyt");
		map2.put(78, "vy");
		map2.put(46, "trfy");
		
		
		
		
		HashMap<Integer,String> map3=new HashMap<Integer,String>();
		map3.put(8, "hgfyt");
		map3.put(78, "vy");
		map3.put(46, "trfy");
		
		
		System.out.println(map1.equals(map3));
		System.out.println(map2.equals(map3));
		System.out.println("----");
		
		//comparing hashmaps for the same  keys :keySet();
		
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map2.keySet().equals(map3.keySet()));
		System.out.println("---");
		
		//find out exxtra keys
		
		HashMap<Integer,String> map4=new HashMap<Integer,String>();
		map4.put(8, "hgfyt");
		map4.put(78, "vy");
		map4.put(46, "trfy");
		
		//extra keys
		
		HashSet<Integer> map5=new HashSet<Integer>(map4.keySet());
		map5.addAll(map1.keySet());
		System.out.println("----");
		map5.removeAll(map4.keySet());
		System.out.println("----");
		System.out.println(map5);
		
		
		// comapre by values
		
		
		
		
		
	

		

		
	
	
		
	}

}
