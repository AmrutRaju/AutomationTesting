package mapPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InternalFunctionMap {
	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("A", "apu");
		map1.put("B", "chadu");
		map1.put("C", "deu");
		
		//Synchronised hash map
		Map<String,String> map2=Collections.synchronizedMap(map1);
		System.out.println(map2);
		
		
		//concurrent hash map
		ConcurrentHashMap<String, String> map3=new ConcurrentHashMap<>();
		map3.put("D", "dev");
		map3.put("E", "paro");
		System.out.println(map3.get("D"));
		
	


		
		
	}

}
//difference between arraylist and linkedlist
//arraylist : dynamic in nature , addind value in index wise
//linkedlist : adding value is easier and effective , more work is possible in less time




// diff. concurrentHashMap and SycndHashMap
//hashmap : not threadsafe
//HashTable: thread safe , slow performance , null key is not allowed
//SynchronizedMap :thread safe , slow performance , null key is  allowed
//ConcurrentHashMap : threadsafe , fast performance, null key is not allowed

