package Package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		/*There are 3 types of collections
		1. List
		2. Set
		3. Map
		
		List - ArrayList, LinkedList, Vector
		List is an Ordered collection and it can save duplicate values also
		
		Set - HashSet, LinkedHashSet, TreeSet
		There is no guarantee concerning the order sequence
		A set is collection that cannot contain Duplicate values
		
		Map - HashMap, TreeMap, LinkedHashMap
		A Map is an object that maps keys to values. A map cannot contain duplicates calues
		HashMap will take in the form of Key value pair
		In ArrayList we while storing the values, Arraylist will take care of indexing. But in HashMap we map key to value.
		
		*/
		
		
		//ArrayList
	/*	ArrayList<String> obj = new ArrayList<String>();
		obj.add("Anees");
		obj.add(1, "Moosa");
		obj.add(1, "Padma");
		obj.add(1, "Divya");
		obj.add("Shakeer");
		
		//System.out.println(obj[0]);
		System.out.println(obj.get(0));
		System.out.println(obj.get(1));
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.contains("Jaffar"));
		obj.add(0,"Jaffar");
		System.out.println(obj);
		obj.add("Jaffar");
		System.out.println(obj);
		//obj.removeAll(obj);
		//System.out.println(obj);
		
		*/
		
		/*ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(505);
		obj.add(7635);
		//obj.add("Anees");
		System.out.println(obj);
		System.out.println(obj.get(1));*/
		
		/*ArrayList obj = new ArrayList();
		obj.add(505);
		obj.add(7635);
		obj.add("Anees");
		obj.add("555");
		System.out.println(obj);*/
		
		
		//HashSet
		
		/*HashSet<String> obj = new HashSet<String>();
		obj.add("Anees");
		obj.add("Shakeer");
		obj.add("Moosa");
		obj.add("Padma");
		obj.add("Anees");
		System.out.println(obj);
		obj.remove("shakeer");
		System.out.println(obj);
		obj.remove("Shakeer");
		System.out.println(obj);
		System.out.println(obj.size());
		//System.out.println(obj.isEmpty());
		//System.out.println(obj.removeAll(obj));
		//System.out.println(obj.isEmpty());
		
		Iterator<String> i = obj.iterator();
		//System.out.println(i);
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		
		//Hash Map
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		
		obj.put(0, "Anees");
		obj.put(1, "Shakeer");
		obj.put(2, "Moosa");
		obj.put(3, "Tesjaswi");
		obj.put(4, "Jaffar");
		obj.put(5, "Padma");
		obj.put(10, "Divya");
		
		System.out.println(obj);
		System.out.println(obj.get(5));
		
		Set s = obj.entrySet();
		System.out.println(obj);
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			//System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		

	}

}
