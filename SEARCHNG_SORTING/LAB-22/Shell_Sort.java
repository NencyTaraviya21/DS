import java.util.Scanner;

public class Shell_Sort {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int []arr= new int[num];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array number arr["+i+"]: ");
            arr[i]=sc.nextInt();    
        }

        for(int gap=num/2; gap>=1; gap=gap/2){
            for(int j=gap; j<num; j++){
                for(int i=j-gap; i>=0; i=i-gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        int temp = arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
        System.out.println("the sorted arr is");  
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
