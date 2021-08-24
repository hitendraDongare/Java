package hashMapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {

	public static void main(String[] args) {
		
		Map<Integer, String>map = new HashMap<Integer, String>();
		
		map.put(100, "Banana");		
		map.put(102, "Kivi");
		map.put(101, "Apple");
		
		System.out.println(map);
		//map.entrySet();
		
		//System.out.println();
		

	}

}
