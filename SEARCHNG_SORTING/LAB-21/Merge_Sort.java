import java.util.Scanner;

public class Merge_Sort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int []arr= new int[num];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array number arr["+i+"]: ");
            arr[i]=sc.nextInt();    
        }
        int low;
        int high=num-1;

    }
}