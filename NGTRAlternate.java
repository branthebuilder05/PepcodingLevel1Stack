//5  8 2 5  7  1 

//8 -1 5 7 -1 -1



import java.util.*;
public class NGTRAlternate
{
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int arr[] = new int[6];
	for(int i=0;i<6;i++)
	    arr[i]=scn.nextInt();
	
	Stack<Integer> st=new Stack<>();
	st.push(0);
	int res[] = new int[6];
	
	
	for(int i=1;i<arr.length;i++){
	   while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){
	       res[st.peek()]=arr[i];
	       st.pop();
	   }
	   st.push(i);
  
	}

	while(!st.isEmpty()){
	    res[st.peek()]=-1;
	   // System.out.println(st.peek());
	    st.pop();
	}
	for(int i=0;i<6;i++)
	    System.out.print (res[i]+" ");
	
	
	
	}
}
