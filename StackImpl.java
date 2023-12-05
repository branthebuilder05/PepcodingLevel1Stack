import java.util.*;
public class StackImpl
{
    public static class Stack{


private int[] st = new int[1];
private int top=-1;

public int peek(){return st[top];}
public int size(){return top+1;}
public int push(int a){
    if(top==st.length-1)
        {
            int newdata[]=new int[2*st.length];
            for(int i=0;i<st.length;i++)
                newdata[i]=st[i];
            newdata[++top]=a;
            st=newdata;
        }
    else
   st[++top]=a;
   
   return a;
}

public int pop(){
    return st[top--];
}
public void display(){
    for(int i=top;i>=0;i--)
        System.out.print(st[i]+" ");
    System.out.println();
}
}

    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Stack s=new Stack();
		s.push(3);
		s.push(56);
			s.push(345);
		s.push(5346);
			s.push(32);
		s.push(5698);
			s.push(34563);
		s.push(5426);
		s.display();
		System.out.println(s.size());
		s.pop();
		s.pop();
		s.display();
		System.out.println(s.size()+" "+s.peek());
		
		
	}
}


