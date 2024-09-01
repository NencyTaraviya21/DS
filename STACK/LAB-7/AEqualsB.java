// 39. How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
// program to solve the above problem.

import java.util.Scanner;
import java.util.Stack;

public class AEqualsB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next().toLowerCase();
            if(str.length() %2 == 1) {
                System.out.println("Invalid String");
                return;
            }
        Stack <Character> stack = new Stack<>();
            for(int i=0; i<str.length(); i++) {
                stack.push(str.charAt(i));
            }
            int index = 1;
            while(index<=str.length()) {
                char ch = stack.pop();
                if(index <= str.length()/2) {
                    if(ch != 'b') {
                        System.out.println("Invalid String");
                        return;
                    }
                }
                else {
                    if(ch!='a') {
                        System.out.println("Invalid String");
                        return;
                    }
                }
                index++;
            }
            System.out.println("Valid String");
        }
    }

