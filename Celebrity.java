import java.util.*;
public class Celebrity
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		 int[][] arr = { {0,1,1,1,1}, {1,0,0,1,0},{1,0,0,1,0},{0,0,0,0,0},{0,1,0,1,0} };
		
		Stack<Integer> si=new Stack<>();
		for(int i=0;i<arr.length;i++)
		    si.push(i);
		    
		    
		while(si.size()>1){
		    int p1=si.pop();
		    int p2=si.pop();
		    if(arr[p1][p2]==1)//means p1 knows p2 so p1 is not celebrity
		         si.push(p2);
		    else // means p1 doesnt know p2 so p2 is not celebrity
		         si.push(p1);
	
		}
		int check=si.pop();
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
		    if(arr[check][i]==1)
		        flag=false;
		}
		
		System.out.println(flag==true?check+" is celebrity":check+" is not celebrity");
		
		
	}
}
