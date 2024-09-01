import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter a string: ");
            String str = scanner.next();
            if(str.length()%2 == 1) {
                System.out.println(0);
            }
            else {
                Stack <Character> stack = new Stack<>();
                boolean flag = true;
                for(int j=0; j<str.length(); j++) {
                    if(str.charAt(j) == '(') {
                        stack.push(')');
                    }
                    else if(str.charAt(j) == '{') {
                        stack.push('}');
                    }
                    else if(str.charAt(j) == '[') {
                        stack.push(']');
                    }
                    else {
                        if(stack.pop() != str.charAt(j)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
        }
        
    }
}

