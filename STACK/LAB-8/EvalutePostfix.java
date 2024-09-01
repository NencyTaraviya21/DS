import java.util.Scanner;
import java.util.Stack;
public class EvalutePostfix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Infix String: ");
        String infix=sc.nextLine();
        Stack <Integer> st=new Stack<>();

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                st.push(Integer.parseInt(ch+""));
            }
            else{
                int num1=st.pop();
                int num2=st.pop();

                if(ch=='+'){
                    st.push(num1+num2);
                }
                else if(ch=='-'){
                    st.push(num1-num2);
                }
                else if(ch=='*'){
                    st.push(num1*num2);
                }
                else if(ch=='/'){
                    st.push(num1/num2);
                }
            }
        }
            int ans=st.pop();
            System.out.println(ans);
}
}
