import java.util.Scanner;
import java.util.Stack;

public class InfixToPost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Infix String: ");
        String infix=sc.nextLine().toLowerCase();
        String postfix="Hello";
        Stack <Character> st=new Stack<>();
        int rank=0;
        int index=0;
        char temp=infix.charAt(index);
        
        
            while(temp!=' '){
            if(temp=='('){
               st.push('(');
               System.out.println(st);
            }
            else if(inputPrecedence(temp)<stackPrecedence(temp)){
                postfix+=st.pop();
            }
            else{
                if(!st.isEmpty()){
                postfix=postfix+st.pop();
                st.pop();
                }
            }
            if(inputPrecedence(temp)!=stackPrecedence(temp)){
                
            }
        }
        System.out.println(postfix);
        }
         
    public static int inputPrecedence(char ch){
        if(ch=='+'||ch=='-'){
           return 1; 
        }
        else if(ch=='*'|| ch=='/'){
            return 3;
        }
        else if(ch=='^'){
            return 6;
        }
        else if(ch>='a' && ch<='z'){
            return 7;
        }
        else if(ch=='('){
            return 9;
        }
        else if(ch==')'){
            return 0;
        }
        return 0;
    }

    public static int stackPrecedence(char ch){
        if(ch=='+'||ch=='-'){
            return 2; 
         }
         else if(ch=='*'|| ch=='/'){
             return 4;
         }
         else if(ch=='^'){
             return 5;
         }
         else if(ch>='a' && ch<='z'){
             return 8;
         }
         else if(ch=='('){
             return 0;
         }
         return 0;
    }
}
