import java.util.*;
public class infixeval
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String s="12+4/4*(116*9)+4/2";
		Stack<Integer> si=new Stack<>();
		Stack<Character> sc = new Stack<>();
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    
		    if(Character.isDigit(c)==true) {
		        if(si.isEmpty()==false && Character.isDigit(s.charAt(i-1))){
		            int temp=si.pop();
		            int a=temp*10+(c-'0');
		            si.push(a);
		            
		        }
		        else
		        si.push(c-'0');
		    } 
		    else if(c=='('){
		        sc.push(c);
		        
		    }else if(c=='+'||c=='-'||c=='*'||c=='/'){
		        //c is solving lower priority operators first
		        while(sc.isEmpty()==false && sc.peek() !='(' && priority(c)<=priority(sc.peek())){
		            int dig2=si.pop();
		            int dig1=si.pop();
		            char c1=sc.pop();
		           
		            int res=eval(dig1,dig2,c1);
		            si.push(res);
		    }
		    //now c will push itself to be solved
		    sc.push(c);
		    }
		    else if(c==')'){
		        while(sc.peek()!='('){
		            int dig2=si.pop();
		            int dig1=si.pop();
		            char c1=sc.pop();
		            
		            int res=eval(dig1,dig2,c1);
		            si.push(res);
		        }
		        sc.pop();
		    }
		    
		    
		}
		while(sc.isEmpty()==false){
		            int dig2=si.pop();
		            int dig1=si.pop();
		            char c1=sc.pop();
		          
		            int res=eval(dig1,dig2,c1);
		            si.push(res);
		}
		
	System.out.println(si.pop()+" "+si.size());	
	}
	public static int eval(int dig1,int dig2,char c){
	      System.out.println("evaluating "+dig1+" "+c+" "+dig2);
	    if(c=='+')
	        return dig1+dig2;
	   else if(c=='-')
	        return dig1-dig2;
	   else if(c=='*')
	        return dig1*dig2;
	   else //if(c=='/')
	        return dig1/dig2;
	   
	        
	}
	public static int priority(char c){
	    if(c=='+')
	        return 1;
	   else if(c=='-')
	        return 1;
	   else if(c=='*')
	        return 2;
	   else //if(c=='/')
	        return 2;
	   
	        
	}
	
	
	
	
	
	
	
	
	
	
	
}
