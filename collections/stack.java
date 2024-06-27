package collections;

import java.util.*;

public class stack {
    public static void main(String[] args) {
    Stack<Integer> stack1 = new Stack<>();  
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    stack1.push(4);
    int p = stack1.pop();
    System.out.println("popped"+p);
Iterator<Integer> itr=stack1.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  }
}}
