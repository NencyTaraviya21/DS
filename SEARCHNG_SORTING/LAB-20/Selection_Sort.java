import java.util.Scanner;
public class Selection_Sort {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int []arr= new int[num];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array number arr["+i+"]: ");
            arr[i]=sc.nextInt();    
        }
        
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("the sorted arr is");  
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

