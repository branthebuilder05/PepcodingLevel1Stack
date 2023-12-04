import java.util.*;
public class SmallestNofollowingpattern
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String s="ddiidi"; //2d1d0i3i5d4i6
		Stack<Integer> st=new Stack<>();
		int ii=0;
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(c=='d'){
		        st.push(ii++);
		        
		    }
		    else{
		         st.push(ii++);
		         while(st.isEmpty()==false)
		            System.out.print(st.pop());
		    }
		}
		st.push(ii);
		         while(st.isEmpty()==false)
		            System.out.print(st.pop());
	}
}
