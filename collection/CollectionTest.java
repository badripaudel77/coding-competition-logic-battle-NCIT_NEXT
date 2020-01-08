package collection;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {

      Collection<String> coll = new ArrayList<>();
            
      System.out.println("Initial size is " + coll.size());
		
      coll.add("Badri Paudel");
      coll.add("Sujan Paudel");
      coll.add("Gita Paudel");
      
     // System.out.println(coll);
	
      Iterator<String> itr = coll.iterator();
      
      int i =1;
      while(itr.hasNext()) {
    	  
    	  System.out.println(i +" ->  " + itr.next() + "  ");
           
    	  i++;
      } 
      
      System.out.println("Now size is " + coll.size());
      
      System.out.println("Using toString method :  " + coll.toString());
}
     
}
