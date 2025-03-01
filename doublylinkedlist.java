public class doublylinkedlist {

    //represent a node of doubly linked list
    class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    //represent head and tail of dll
    Node head,tail=null;

    //addNode() will add node to list
    public void addNode(int data) {
        //create a new node
        Node newNode = new Node(data);

        //if list is empty
        if(head==null){
            //Both head and tail will point to new node
            head=tail=newNode;

            //head's previous will point to null
            head.previous=null;

            //tail's next will point to null,as it is the last nodeof list
            tail.next=null;
        }
        else{
            //new node will be added after tail such that tail's next point to newnode
            tail.next=newNode;

            //newNode's previous will point to tail
            newNode.previous=tail;

            //newNode will become new tail
            tail=newNode;

            //As it is last node, tail's next will point to null
            tail.next=null;
        }
        
    }
    //display() will print out the nodes of the list
    public void display(){
        //node current will point to head
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("Nodes of doubly linked list : ");
        while(current!=null){
            //prints each node by incrementing the pointer 
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    //reverse() will print out the nodes of the list
    public void reverse() {
        //node current will point to tail
        Node current=tail;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.print("Nodes of doubly linked list in reverse are : ");
        while(current!=null){
            //prints each node by decrementing the pointer
            System.out.print(current.data+" ");
            current=current.previous;
        }
        
    }
    public static void main(String[] args) {
        doublylinkedlist dList=new doublylinkedlist();

        //add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //displays the nodes present in the list
        dList.display();
        System.out.println();
        dList.reverse();
    }
}


// if list is empty 
//if(head==null{
    //both head and tail will point to new node
    //head's previous will point to new node
    //tail's next will point to null, as it is the last node of the list
    //new node will be added after tail such that tail's 
//})