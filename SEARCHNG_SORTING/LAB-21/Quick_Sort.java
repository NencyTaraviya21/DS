import java.util.Scanner;

public class Quick_Sort {
    public static void main(String [] args){
        int [] arr={2, 11, -1, -2, 34, 555, 1234, -33};

            qs(arr,0,arr.length-1);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
        static int partition(int []arr, int low, int high){
        int pivot=low;
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>=pivot && j>=low+1){
                j++;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            return j;
    } 
        public static void qs(int[] arr, int low, int high) {
            if (low < high) {
                int pIndex = partition(arr, low, high);
                qs(arr, low, pIndex - 1);
                qs(arr, pIndex + 1, high);
            }
        }
        // public static int[] quickSort(int[] arr) {
        //     // Write your code here.
        //     qs(arr, 0, arr.length - 1);
        //     return arr;
        // }
    } 

        

