//5  8 2 5  7  1 

//8 -1 5 7 -1 -1

//2 5 8 7 19 3 22 17
//3 15 9 2 13 16 8 5
import java.util.*;
public class span
{
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int arr[] = new int[8];
	for(int i=0;i<8;i++)
	    arr[i]=scn.nextInt();
	
	Stack<Integer> st=new Stack<>();
	st.push(arr[0]);
	int res[] = new int[arr.length];
	res[0]=0;
	
	for(int i=1;i<arr.length;i++){
	   while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){
         st.pop();	   
         
	}
	if(st.isEmpty()==false)
	    res[i] =st.peek();
	st.push(i);

	}
	
	
	//find span Array
	int span[]=new int[arr.length];
	for(int i=0;i<arr.length;i++){
	    span[i] = i-res[i];
	}
	span[0]=1;
	for(int i=0;i<arr.length;i++)
	    System.out.print (arr[res[i]]+" ");
	    
	    System.out.println();
	
	for(int i=0;i<arr.length;i++)
	    System.out.print (span[i]+" ");
	
	
	
	}
	
}
