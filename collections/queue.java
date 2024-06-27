package collections;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        qu.add(4);
        qu.add(2);
        qu.add(3);
        qu.add(7);
        Iterator<Integer> it = qu.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("head:"+qu.peek());
        System.out.println("head:"+qu.element());
        System.out.println("remove:"+qu.remove());
        System.out.println("poll:"+qu.poll());
        System.out.println("after ");
        Iterator<Integer> ite = qu.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        Deque<Integer> de = new ArrayDeque<>();
        de.addFirst(3);
        de.addFirst(2);
        de.offerFirst(1);
        de.addLast(5);
        de.offerLast(6);
        System.out.println("deque");
        for(Integer num : de){
            System.out.println(num);
        }
        System.out.println("set");
        HashSet<String> set=new HashSet<String>();  
  set.add("Ravi");  
  set.add("Vijay");  
  set.add("Ravi");  
  set.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
    }
}
