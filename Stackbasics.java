import java.util.*;
public class Stackbasics
{
	public static void main(String[] args) {
	    Stack<Integer> st= new Stack<>();
	    st.push(2);
	    st.add(5);
	    st.add(456);
	    System.out.println(st.peek());
	    st.add(2341);
	    //st.pop();
	    	System.out.println("Hello World"+ st+" "+st.size()+" "+st.isEmpty());
	    //needs index to remove st.remove(3);
	    //not woking st.poll();
		System.out.println("Hello World"+ st+" "+st.size()+" "+st.isEmpty());
		
		
	}
}
