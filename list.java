import java.util.*;
public class list{
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for(String fruit:list){
            System.out.println(fruit);
        }

        //convert arr to list
        String[] arr={"JAVA","Python","PHP","C++"};
        for(String lang:arr){
            list.add(lang);
        }
        System.out.println(list);


        //convert arraylist to array
        String[] array=list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        //get() and set()method
        System.out.println(list.get(2));
        list.set(2,"Pomengranate");
        for(String s:list)
        System.out.print(s+",");
        System.out.println();
 
        //sort list
        Collections.sort(list);
        for(String s:list){
            System.out.print(s+" ");
        }

        
    }
}