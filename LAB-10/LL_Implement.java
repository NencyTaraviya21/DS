class Link {
    Node first=null;
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
        if(first==null){
            first=newnode;
            return;
        }
        Node temp=first;
        first=newnode;
        first.link=temp;
    
    }
    public void insertATEnd(int data){
    Node newnode=new Node(data);
      if(first==null){
        first=newnode;
        return;
      }

      Node last=first;
      while(last.link!=null){
        last=last.link;
      }
      last.link=newnode;
    }

    public void insertInOrder(int data){
    Node newnode=new Node(data);
    if(first==null){
        first=newnode;
        return;
      }

      Node temp=first;
      if(newnode.info<=first.info){
        newnode.link=first;
        first=newnode;
      }
      else{
        while(temp.link!=null && newnode.info>=temp.link.info){
            temp=temp.link;
        }
        newnode.link=temp.link;
        temp.link=newnode;
      }
      for(temp=first;temp.info>=newnode.info;temp=temp.link){
        System.out.println(temp.info);
      }
        
      
    }

    public void printData(){
        Node temp = first;

        if(first == null){
           System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.info + "--> ");
            temp = temp.link;
        }
        System.out.println("Null");
    }

    public void deleteFromFirst(){
        if(first==null){
            System.out.println("Satck underflow");
            return;
        }
        for(Node temp=first.link;temp!=null; temp=temp.link) {
          System.out.println(temp.info);  
        }
    }

    public void deleteFromEnd(){
        if(first==null){
            System.out.println("Satck underflow");
            return; 
        }
        for(Node temp=first.link; temp.link!=null; temp=temp.link){
            System.out.println(temp.info);
        }
    }

    int key;
    public void deleteInOrder(int key){
        if(first==null){
            System.out.println("Satck underflow");
            return; 
        }
        
        Node temp=first ,pre=null;
        if (temp.info==key) {
            return;
        }
        while(temp!=null && temp.info!=key){
            pre=temp;
            temp=temp.link;
        }
        if(temp==null){
            System.out.println("Node not found");
        }
        pre.link=temp.link;

        for(temp=first; temp.info!=key ;temp=temp.link){
            System.out.println(temp.info);
        }
        for(temp.info=key+1; temp!=null; temp=temp.link)
        System.out.println(temp.info);
    }
    }
   
    public class LL_Implement{
        public static void main(String [] args){
            Link obj=new Link();
            System.out.println("insertion: ");
            obj.insertAtFirst(10);
            obj.insertAtFirst(20);
            obj.insertAtFirst(30);
            obj.insertAtFirst(40);
            obj.printData();

            // System.out.println("\nInsert in order: ");
            // obj.insertInOrder(15);

            System.out.println("\nInsert at end\n ");
            obj.insertATEnd(50);
            obj.printData();

            System.out.println("\n\nDeletion: ");
            obj.deleteFromFirst();
            System.out.println("\n");
            obj.deleteFromEnd();
            System.out.println("\n");
            obj.deleteInOrder(50);
            
            
        }
    }