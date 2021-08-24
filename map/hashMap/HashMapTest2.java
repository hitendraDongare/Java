package hashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		Student st1 = new Student(101, "Pankaj", "Pune");
		Student st2 = new Student(102, "Hitendra", "Pune");
		Student st3 = new Student(103, "Amit", "Mumbai");
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, st1);
		map.put(2, st2);
		map.put(3, st3);
		
		//System.out.println(map);
		/*for(Map.Entry<Integer, Student> m:map.entrySet())
		{
			int key = m.getKey();
			Student st = m.getValue();
			System.out.println(key +" Details : "+st.getRollNo()+" "+st.getName()+" "+st.getAddress());
			//System.out.println(st.getRollNo()+" "+st.getName()+" "+st.getAddress());
		}*/
		
		Iterator<Integer>itr = map.keySet().iterator();
		while(itr.hasNext())
		{
			int key = itr.next();
			Student st = map.get(key);
			System.out.println(key +" Details : "+st.getRollNo()+" "+st.getName()+" "+st.getAddress());
		}

	}

}
