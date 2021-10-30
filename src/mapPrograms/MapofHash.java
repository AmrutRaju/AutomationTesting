package mapPrograms;

import java.util.HashMap;

public class MapofHash {
	public static void main(String[] args) {
		// no order and no indexing
		//stores val;uie ==key-value pair format
		HashMap <String,String>   str=new HashMap<String,String>();
		str.put("india", "new delhi");
		str.put("usa", "washington dc");
		str.put("uk", "london");
		System.out.println(str.get("india"));
		System.out.println(str.get("uk"));
		str.put("uk", "london11");
		System.out.println(str.get("uk"));    //over riden by latest value over there
		
		
		
		//can store multiple null values but one null key
		
		str.put(null, "berlin");
		str.put(null, "la");
		str.put("rusia", null);
		System.out.println(str.get(null));
		System.out.println(str.get("rusia"));
		
		
		//iterator using for-each and lambda 
		
		
		str.forEach((k,v)->System.out.println("key="+k+"value="+v));
		
		
		
		}

}

