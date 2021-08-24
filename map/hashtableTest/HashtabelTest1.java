package hashtabelTest;

import java.util.Hashtable;

public class HashtabelTest1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String>m = new Hashtable<Integer, String>();
		
		m.put(1, "Pankaj");
		m.put(4, "Chetan");
		m.put(3, "Amit");
		m.put(2, "Pratik");
		System.out.println(m);
		
		System.out.println(m.getOrDefault(6, "value not found"));
		
		m.putIfAbsent(5, "Narendra");
		System.out.println(m);
		
		m.putIfAbsent(4, "Vijay");
		System.out.println(m);

	}

}

