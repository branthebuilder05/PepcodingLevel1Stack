//InfixtoPrefixAndpostfix conversion


import java.util.*;
public class InfixtoPrefixAndpostfix
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		String s="2+4/4*(6*9)+4/2";
	//	String t="a*(b-c)/d+e";
		String prefix;
		String postfix;
		Stack<String> pre=new Stack<>();
		Stack<String> post=new Stack<>();
		Stack<Character> sc = new Stack<>();
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    
		    if(Character.isLetterOrDigit(c)==true) {
		      //  if(si.isEmpty()==false && Character.isDigit(s.charAt(i-1))){
		      //      int temp=si.pop();
		      //      int a=temp*10+(c-'0');
		      //      si.push(a);
		            
		      //  }
		      //  else
		        pre.push(c+"");
		        post.push(c+"");
		    } 
		    else if(c=='('){
		        sc.push(c);
		        
		    }else if(c=='+'||c=='-'||c=='*'||c=='/'){
		        //c is solving lower priority operators first
		        while(sc.isEmpty()==false && sc.peek() !='(' && priority(c)<=priority(sc.peek())){
		     
		            char c1=sc.pop();
		            
		            String pre2=pre.pop();
		            String pre1=pre.pop();
		            String preres=c1+pre1+pre2;
		            pre.push(preres);
		            
		            String post2=post.pop();
		            String post1=post.pop();
		            String postres=post1+post2+c1;
		            post.push(postres);
		            
		            
		            
		    }
		    //now c will push itself to be solved
		    sc.push(c);
		    }
		    else if(c==')'){
		        while(sc.peek()!='('){
		             char c1=sc.pop();
		            
		            String pre2=pre.pop();
		            String pre1=pre.pop();
		            String preres=c1+pre1+pre2;
		            pre.push(preres);
		            
		            String post2=post.pop();
		            String post1=post.pop();
		            String postres=post1+post2+c1;
		            post.push(postres);
		        }
		        sc.pop();
		    }
		    
		    
		}
		while(sc.isEmpty()==false){
		             char c1=sc.pop();
		            
		            String pre2=pre.pop();
		            String pre1=pre.pop();
		            String preres=c1+pre1+pre2;
		            pre.push(preres);
		            
		            String post2=post.pop();
		            String post1=post.pop();
		            String postres=post1+post2+c1;
		            post.push(postres);
		}
		
	System.out.println(pre.pop()+"\n "+post.pop());	
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
