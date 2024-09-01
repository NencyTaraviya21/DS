import java.util.Scanner;
class Stack_Demo{
Scanner sc=new Scanner(System.in);
int[] arr;
int top,n,i;

    Stack_Demo(int n){
        arr=new int[n];
        this.n=n;
        top=-1;

    }
    public void push(int n){
        if(top>=n-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top]=n;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            top--;
            return(arr[top+1]);
        }
    }
    public void peep(int i){
        if((top-i+1<=0)){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(arr[top-i+1]);
        }
    }
    public void change(int i,int n){
        if((top-i+1<=0)){
            System.out.println("Stack underflow");
            return ;
        }
        else{
            arr[top-i]=n;
            return;
        }
    }
    public void displayStack(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class StackDemo{
    public static void main(String[] args){
    int n=5;
    Stack_Demo obj=new Stack_Demo(n);
    obj.push(5);
    obj.displayStack();
    obj.pop();
    obj.displayStack();
    obj.push(5);
    obj.displayStack();
    obj.peep(0);
    obj.displayStack();
    obj.change(0,222);
    obj.displayStack();

    // obj.displayStack();    
    }
}
