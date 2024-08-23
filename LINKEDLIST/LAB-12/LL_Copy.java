class CopyLL{
Node first=null;
Node begin=null;

 class Node{
    int info;
    Node link;
    int field;
    Node link2;

    Node(int data){
     this.info=data;
     this.field=field;
     this.link=null;
     this.link2=null;
     
    }
 }
    public void insertElement(int data){
        Node newnode=new Node(data);
        if(first==null){
            first=newnode;
            return;
        }
        Node temp=first;
        first=newnode;
        first.link=temp;
    }
    public void displayLL(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.info);
            temp=temp.link;
        }

    }
    public void copyLL(){
        Node temp=first;
        while(temp!=null){
            // System.out.println(temp.info);/
            Node copy = new Node(temp.info);
            copy.link = temp.link;
            temp=temp.link;
            System.out.println(copy.info);
            // System.out.println(copy);
            // System.out.println(temp);
        }
    }
}

public class LL_Copy {
    public static void main(String[] args){
    CopyLL object=new CopyLL();
    object.insertElement(10);
    object.insertElement(20);
    object.insertElement(30);
    object.insertElement(40);
    object.insertElement(50);
    System.out.println("LL 1: ");
    object.displayLL();
    System.out.println("LL 2: ");
    object.copyLL();
    
    }
}
