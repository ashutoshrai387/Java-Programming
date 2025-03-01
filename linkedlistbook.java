import java.util.*;
class book{
    int id;
    String name,author,publisher;
    int quantity;
    book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}
public class linkedlistbook {
    public static void main(String[] args) {
        book b1=new book(101,"Let us c","yk","BPB",8);
        book b2=new book(102,"Data comm","mr f","mc graw hill",4);
        book b3=new book(103,"O s","galvin","wiley",6);

        LinkedList<book> list=new LinkedList<book>();
        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(book b:list){
            System.out.println(b.id+","+b.name+","+b.author+","+b.publisher+","+b.quantity);
        }
    }
}
