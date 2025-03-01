import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
       LinkedList<String> al=new LinkedList<String>();
       al.add("Ravi");
       al.add("Vijay");
       al.add("Ravi");
       al.add("Ajay");
       
       Iterator<String> itr=al.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }

       for(String s:al){
        System.out.println(s);
       }

       al.add(1,"Gaurav");
       LinkedList<String> al2=new LinkedList<String>();
       al2.add("Sonoo");
       al2.add("Hanumat");
       al.addAll(2,al2);
       System.out.println(al);

       al.remove(0);
       //al.clear();
       System.out.println(al);

       //reversing a list
       Iterator i=al.descendingIterator();
       while(i.hasNext()){
        System.out.println(i.next());
       }
    }
}
