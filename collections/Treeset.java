package collections;
import java.util.*;
public class Treeset {
	   
	 public static void main(String args[]){    
	 TreeSet<Integer> set=new TreeSet<Integer>();    
	         set.add(24);    
	         set.add(66);    
	         set.add(12);    
	         set.add(15);
	         set.add(1);
	         set.add(14);
	         System.out.println("Lowest Value: "+set.first());    
	         System.out.println("Highest Value: "+set.pollLast());  
	         for(Integer s : set) {
	        	 System.out.println(s);
	         }
	         
	         
	           TreeSet<String> set1=new TreeSet<String>();  
	                  set1.add("A");  
	                  set1.add("B");  
	                  set1.add("C");  
	                  set1.add("D");  
	                  set1.add("E");  
	                  System.out.println("Initial Set: "+set1);  
	                    
	                  System.out.println("Reverse Set: "+set1.descendingSet());  
	                    
	                  System.out.println("Head Set: "+set1.headSet("C"));  
	                   
	                  System.out.println("SubSet: "+set1.subSet("A", false, "E", true));  
	                    
	                  System.out.println("TailSet: "+set1.tailSet("C", false));  
	          }  
	         
	 }    
	


