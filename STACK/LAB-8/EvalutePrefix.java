import java.util.Scanner;
import java.util.Stack;

public class EvalutePrefix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Infix String: ");
        String prefix=sc.nextLine();
        Stack <Integer> st=new Stack<>();
        

        for(int i=prefix.length()-1;i>=0;i--){
            char ch = prefix.charAt(i);
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
