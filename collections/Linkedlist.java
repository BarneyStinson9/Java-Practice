package collections;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("riya");
        llist.add("siya");
        llist.add("miya");
        llist.add("jiya");

        Iterator<String> it = llist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
