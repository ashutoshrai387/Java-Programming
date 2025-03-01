import java.util.*;
public class listiterator {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add("Sachin");

        ListIterator<String> itr=al.listIterator();
        System.out.println("Forward dir'n");
        while(itr.hasNext()){
            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("\nBackward dir'n");
        while(itr.hasPrevious()){
            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}
