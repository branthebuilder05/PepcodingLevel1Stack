//5  8 2 5  7  1 

//8 -1 5 7 -1 -1

//2 5 8 7 19 3 22 17
//3 15 9 2 13 16 8 5
import java.util.*;
public class slidingWindow
{
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int arr[] = new int[8];
	for(int i=0;i<arr.length;i++)
	    arr[i]=scn.nextInt();
	
	Stack<Integer> st=new Stack<>();
	st.push(arr.length-1);
	int ngtr[] = new int[arr.length];
	ngtr[arr.length-1]=arr.length;
	for(int i=arr.length-2;i>=0;i--){ 
	   while(st.isEmpty()==false && arr[st.peek()]<=arr[i])
	        st.pop();
	    if(st.isEmpty()==false)
	        ngtr[i]=st.peek();
	   else
	        ngtr[i]=arr.length;
	   st.push(i);
	    
	}
	
// 	for(int i=0;i<arr.length;i++)
// 	    System.out.print(ngtr[i]+" ");
	    
	    int res[] = new int[arr.length-4];
	for(int i=0;i<arr.length-4;i++){
	    int j=i;
	        while(ngtr[j]<i+4&& j<arr.length){
	            j=ngtr[j];
	        }
	        res[i]=arr[j];
	    
 	}
		for(int i=0;i<res.length;i++)
	    System.out.print(res[i]+" ");

	}
}
