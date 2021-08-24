package hashMapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(4, "Grapes");
		map.put(5, "Kivi");
		//map.put(2, "Pinaple");
		System.out.println(map);
		
		for(Map.Entry<Integer, String>m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		map.remove(2);
		
		System.out.println("After removing the key : "+map);
		
		map.remove(5,"Kivi");
		System.out.println("After removing the key : "+map);
		
		map.replace(1, "Banana");
		System.out.println("Updated map :"+map);
		
		map.replace(3, "Apple", "Mango");
		System.out.println("Updated map :"+map);
		
		map.replaceAll((k,v)->"Mango");
		System.out.println("Updated map :"+map);

	}

}

