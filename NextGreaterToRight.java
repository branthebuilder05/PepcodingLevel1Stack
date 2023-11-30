//5  8 2 5  7  1 

//8 -1 5 7 -1 -1



import java.util.*;
public class NextGreaterToRight
{
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int arr[] = new int[6];
	for(int i=0;i<6;i++)
	    arr[i]=scn.nextInt();
	
	Stack<Integer> st=new Stack<>();
	st.push(arr[5]);
	int res[] = new int[6];
	res[5] = -1;
	for(int i=arr.length-2;i>=0;i--){
	    //-a+
	    while(st.size()>0 &&  arr[i]>=st.peek()  ){
	        st.pop();
	    }
	    if(st.size()==0){
	       res[i]=-1;
	    }
	    else if (arr[i]<st.peek() && st.size()>0){
	       res[i]=st.peek();
	    }
	     
	    st.push(arr[i]);
	    
	    
	    
	    
	    
	}
	for(int i=0;i<6;i++)
	    System.out.print (res[i]+" ");
	
	
	
	}
}
