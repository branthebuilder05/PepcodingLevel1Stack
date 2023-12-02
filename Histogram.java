//5  8 2 5  7  1 

//8 -1 5 7 -1 -1

//2 5 8 7 19 3 22 17
//3 15 9 2 13 16 8 5
import java.util.*;
public class Histogram
{
	public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int arr[] = new int[7];
	for(int i=0;i<arr.length;i++)
	    arr[i]=scn.nextInt();
	
	Stack<Integer> st=new Stack<>();
	
	int nstl[] = new int[arr.length];
	int nstr[] = new int[arr.length];
	
	st.push(0);
	nstl[0]=-1;
	
	//nstl
	for(int i=1;i<arr.length;i++){
	   while(st.isEmpty()==false && arr[st.peek()]  >=arr[i]){
         st.pop();	   
         
	}
	if(st.isEmpty()==false)
	    nstl[i] =st.peek();
	else
	    nstl[i]=-1;
	st.push(i);

	}

	Stack<Integer> st1=new Stack<>();
	st1.push(arr.length-1);
	nstr[arr.length-1]=arr.length;
	
	//nstr
	for(int i=arr.length-2;i>=0;i--){
	   while(st1.isEmpty()==false && arr[st1.peek()]  >=arr[i]){
         st1.pop();	   
         
	}
	if(st1.isEmpty()==false)
	    nstr[i] =st1.peek();
	else
	     nstr[i] =arr.length;
	st1.push(i);

	}
	
	
	
	
// 	for(int ele:nstl)
//     	System.out.print(arr[ele]+" ");
	
// 	System.out.println();
	
// 	for(int ele:nstr)
//     	System.out.print(arr[ele]+" ");
	int area=0;
	for(int i=0;i<arr.length;i++){
	    int temp=(nstr[i]-nstl[i]-1)*arr[i];
	    if(temp>area)
	        area=temp;
	}
	
	System.out.println(area);
	}
	
}
