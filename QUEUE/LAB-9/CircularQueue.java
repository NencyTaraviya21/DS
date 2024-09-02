class Queue{
    int rear=-1,front=-1;
    int[] Q=new int[10];

    public void CQEnqueue(int n){
        if(rear==10){
            rear=1;
        }
        else{
            rear++;
        }
        if(front==-1){
            front=0;
        }
        Q[rear]=n;
        return;
    }
    public int CQDequeue(){
        if(front==-1){
            System.out.println("Stack is underflow");
            return 0;        
        }
        if(front==10){
            front=0;
        }
        else{
            front++;
        }
        return Q[front];
    }
    public void displayQueue(){
        for(int i=front;i<=rear;i++){
            System.out.println(Q[i]);
        }
    }

}
public class CircularQueue {
    public static void main(String[] args) {
        Queue obj=new Queue();

        System.out.println("Elements in the queue:\n ");
        obj.CQEnqueue(1);
        obj.CQEnqueue(2);
        obj.CQEnqueue(3);
        obj.displayQueue();

        System.out.println("Elements after dequeue:\n ");
        obj.CQDequeue();
        obj.displayQueue();
    }
}
