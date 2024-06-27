package collections;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("riya");
        list.add("siya");
        list.add("miya");
        list.add("jiya");

        Iterator<String>it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(list);
    }
}
