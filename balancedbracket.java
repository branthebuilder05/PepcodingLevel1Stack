import java.util.*;
public class balancedbracket
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    while(true){
	        System.out.println("Enter the experssion");
	    
	    String s=scn.nextLine();
	    Stack<Character> st= new Stack<>();
	    boolean flag=true;
	    for(int i=0;i<s.length();i++){
	        char c = s.charAt(i);
	        if((c == '(' || c=='{' || c=='[' ))
	            st.push(c);
	       else if((c == ')' || c=='}' || c==']' )){
	           if(c==')'){
	               if(st.peek()=='('){
	                    st.pop();
	                    continue;
	               }
	               else{
	                   flag=false;
	                   break;
	               }
	           }
	           else if(c=='}'){
	               if(st.peek()=='{'){
	                    st.pop();
	                    continue;
	               }
	               else{
	                   flag=false;
	                   break;
	               }
	           }
	           else if(c==']'){
	               if(st.peek()=='['){
	                    st.pop();
	                    continue;
	               }
	               else{
	                   flag=false;
	                   break;
	               }
	           }
	               
	           }
	       }
	        
 
	    
	   
	    System.out.println(flag==true?"balanced hai":"not balanced");
	    }
	}
}
