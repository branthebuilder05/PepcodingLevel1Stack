import java.util.*;
public class duplicacy
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    String s=scn.nextLine();
	    Stack<Character> st= new Stack<>();
	    boolean flag=false;
	    for(int i=0;i<s.length();i++){
	        char c = s.charAt(i);
	        if(c != ')'){ // push char and (
	            st.push(c);
	        }
	        else{
	            if(st.peek() == '('){
	                flag = true; // duplicacy hai
	                break;
	            }
	            else{
	                while(st.peek() !='(')
	                    st.pop();
	               st.pop();
	            }
	        }
 
	    }
	   
	    System.out.println(flag==true?"duplicacy hai":"no duplicacy");
	   
	}
}
