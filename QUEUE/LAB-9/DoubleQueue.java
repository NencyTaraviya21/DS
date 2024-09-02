class Queue{
    int [] Q=new int[10];
    int front=-1,rear=-1;

    public void DQ_Ins_front(int n){
        if(front==-1){
            System.out.println("overflow");
        }
        if(front==-1){
            front=rear=0;
        }
        else{
            front--;
        }
        Q[front]=n;
    }
    public void DQ_Ins_rear(int n){
        if(rear>=9){
            System.out.println("Queue is overflow");
        }
        else{
            if(rear==-1){
                front=0;     
            }
            rear++;
            Q[rear]=n;
        }
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(Q[i]);
        }
    }
}
public class DoubleQueue {
    public static void main(String[] args) {
    Queue obj= new Queue();
    obj.DQ_Ins_front(3);
    obj.DQ_Ins_front(4);
    obj.DQ_Ins_rear(14);
    obj.display();
 
    }
}
