import java.util.Scanner;
import java.util.Arrays;

public class Linear_Probing{
    static int array[] = new int[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[15];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array number arr["+i+"]: ");            
            arr[i] = sc.nextInt();
        }

        store(arr);
        System.out.println(Arrays.toString(array));
    }

        public static void store(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                int index = Hashfn(arr[i]);
                array[index]=arr[i];
            }
        }

        public static int Hashfn(int n){
            int index = (n%18)+2;
            if(array[index]!=0){
                while(array[index]!=0){
                    index=(++index)%20;
                }
            }
            return index;
        }

    }