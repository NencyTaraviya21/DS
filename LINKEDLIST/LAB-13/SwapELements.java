import java.util.Scanner;
class Swap{
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
}
public class SwapELements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Swap obj = new Swap();
		System.out.print("Enter size of LL : ");
		int n = sc.nextInt();

		for(int i=1;i<=n;i++){
			System.out.print("Enter element of LL : ");	
			obj.insertATEnd(sc.nextInt());
		}
        
        for(Node swap=first;swap<=last;swap=swap.link)
        obj.printData();
    }
}
