//posrfix to infix and prefix
//also find result of evaluation of expression


import java.util.*;
public class postfixToConversion
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String s1="264*8/+3-"; //postfix given
		Stack<String> infix=new Stack<>();
		Stack<String> prefix=new Stack<>();
		Stack<Integer> value=new Stack<>();
		
		for(int i=0;i<s1.length();i++){
		    char c=s1.charAt(i);
		    if(Character.isDigit(c)){
		        infix.push(c+"");
		        prefix.push(c+"");
		        value.push(c-'0');
		    }
		    else{
		        String val2=infix.pop();
		        String val1=infix.pop();
		        String res="("+val1+c+val2+")";
		        infix.push(res);
		        
		        val2=prefix.pop();
		        val1=prefix.pop();
		        res=c+val1+val2;
		        prefix.push(res);
		        
		        int b=value.pop();
		        int a=value.pop();
		        int reslt=eval(a,b,c);
		        value.push(reslt);
		    }
		    
		    
		}
		
		System.out.println(value.pop());
		System.out.println(infix.pop());
		System.out.println(prefix.pop());
	}
	public static int eval(int a,int b,char c){
	    if(c=='+')
	        return a+b;
	   else if(c=='-')
	        return a-b;
	   else if(c=='/')
	        return a/b;
	   else //if(c=='*')
	        return a*b;
	        
	}
}
