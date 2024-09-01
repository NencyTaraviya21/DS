import java.util.Scanner;
import java.util.Stack;

public class Recognise{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase();
        if(str.length() % 2 == 0) {
            System.out.println("Invalid String");
            return;
        }
        int temp = str.length()/2;
        if(str.charAt(temp) != 'c') {
            System.out.println("Invalid String");
            return;
        }
        int len = str.length()/2;
        Stack <Character> stack = new Stack<>();
        int index = 0;
        while(index < len) {
            stack.push(str.charAt(index));
            index++;
        }
        index++;
        
        while(index < str.length()) {
            char ch = stack.pop();
            if(str.charAt(index) != ch) {
                System.out.println("Invalid String");
                return;
            }
            index++;
        }
        System.out.println("Valid String");
    }
}
