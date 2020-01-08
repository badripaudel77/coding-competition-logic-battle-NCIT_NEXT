package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {

		//creating map 
		
		Map<Integer,String> hmap = new  HashMap<>();
		
		hmap.put(1, "Nepal");
		hmap.put(2, "China");
		hmap.put(3, "Bhutan");
		hmap.put(4, "Pakistan");
		hmap.put(5, "Bangladesh");
		
		System.out.println("Map's content is " + hmap + " \n");
		
		//iterating map 
		
		System.out.println(hmap.entrySet()); //gives whole thing in key=value format
		
		System.out.println("At one (1) index => " + hmap.get(1));
		
		System.out.println("set of keys => " +  hmap.keySet()); // gives set of keys present only.
			
		for(Entry<Integer, String> map :hmap.entrySet()) {
			
			System.out.println(map.getKey() + " => " + map.getValue());
			
		}
	}

}
