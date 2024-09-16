import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort{
    public static void main(String [] args){
        int []arr= {3,-1,5,7,22,8,19,23,1,-22,1334};
        
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
}
    
    public static void mergeSort(int[] arr, int low, int high){
        if (low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
            
        public static void merge(int arr[], int low, int mid, int high){
            int left=low;
            int right=mid+1;
            int arr2[] = new int[arr.length];
            int temp=low;  
    
            while(left<=mid && right<=high ){
                // System.out.println("hii");
                if(arr[left]<=arr[right]){
                    arr2[temp]=arr[left];
                    left++;    
                }
                else{
                    arr2[temp]=arr[right];
                    right++;
                }
                temp++;
            }
            if(left > mid){
                for(int i=right; i<=high; i++){
                    arr2[temp]=arr[i];
                    temp++;
                }
            }
            else{
                for(int i=left; i<=mid; i++){
                    arr2[temp]=arr[i];
                    temp++;
                }
            }
            for(int i=low; i<=high; i++){
                arr[i]=arr2[i];
                // System.out.println(arr[i]);
            }   
        }
        
}
