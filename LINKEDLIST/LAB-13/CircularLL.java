class Circular{
    Node first=null;
    Node last=null;

    class Node{
        int info;
        Node link;

        Node(int data){
            this.info=data;
            this.link=null;
        }
    }
    public void insertAtFirst(int data){
        Node newnode=new Node(data);
        // Node temp=first;

        if(first==null){
            newnode.link=newnode;
            first=newnode;
            last=newnode;
        }
        else{
            newnode.link=first;
            first=newnode;
            last.link=first;
        }
    }
    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(first==null){
            newnode.link=newnode;
            first=newnode;
            last=newnode;
        }
        else{
            last.link=newnode;
            last=newnode;
            last.link=first;
        }
    }
    public void insertInOrder(int data){
        Node newnode=new Node(data);
        if(first==null){ 
            first=newnode;
            last=newnode;
            first.link=first;
            return;   
        }
        if(first.info>=data){
            newnode.link=first;
            last.link=newnode;
            first=newnode;
            return;
        }
        Node temp=first;
        while(temp!=last && newnode.info>=temp.link.info){
            temp=temp.link;  
        }
        newnode.link=temp.link;
        temp.link=newnode;
        if(temp==last){
            last=newnode;
            return;
        }
        
    }
    public void display(){
        Node temp=first;
        while(temp!=last){
            System.out.println(temp.info);
            temp=temp.link;
        }
        System.out.println(temp.info);
    }

    public void deleteFromFirst(){
        if(first==null){
            System.out.println("Satck underflow");
            return;
        }
        for(Node temp=first.link; temp!=last; temp=temp.link) {
          System.out.println(temp.info);  
        }
    }

    public void deleteFromEnd(int val){
        Node temp=first;
        if(first == last){
            first = null;
            last = null;
            return;
        }
        else if(val==first.info){
            first=first.link;
            last.link=first;
            return;
        }
        if(temp.link!=last){
            temp=temp.link;
        }
        last=temp;
        last.link=first;
        return;
    }
}
public class CircularLL {
    public static void main(String[] args) {
        Circular obj = new Circular();
        System.out.println("Insertion at first: ");
        obj.insertAtFirst(10);
        obj.insertAtFirst(20);
        obj.insertAtFirst(30);
        obj.insertAtFirst(40);
        obj.insertAtFirst(50);
        obj.display();

        System.out.println("\nInsertion at end: ");
        obj.insertAtEnd(60);
        obj.display(); 

        // System.out.println("Insertion in order: ");
        // obj.insertInOrder(35);
        // obj.display();

        System.out.println("\ndeletion at first: ");
        obj.deleteFromFirst();

        System.out.println("\ndeletion from end: ");
        obj.deleteFromEnd();
        
    }
}
