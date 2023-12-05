import java.util.*;
public class QueueImpl
{
    public static class Queue{


private int[] q = new int[1];
private int front=-1;
private int size=0;

public int peek(){
    if(size==0){
        System.out.println("empty");
        return Integer.MIN_VALUE;
    }
    else{
        return q[front];
    }
}

public int size(){return size;}

public int push(int a){
    if(size==q.length){
        //System.out.println("overflow");
        int newq[]=new int[2*size];
        for(int i=0;i<size;i++){
            int idx=(front+i)%q.length;
            newq[i]=q[idx];
        }
        front=0;
         int idx=(front+size); //last index find
        newq[idx]=a;
        size++;
        q=newq;
    }
    else{
        int idx=(front+size)%q.length; //last index find
        q[idx]=a;
        size++;
    }
return a;
}

public int pop(){
    if(size==0){
        System.out.println("empty stack");
        return Integer.MIN_VALUE;
    }
    else{
        size--;
        if(front>q.length)
            front=front%q.length;
        return q[front++];
    
    }
}
public void display(){
    for(int i=0;i<size;i++){
            int idx=(front+i)%q.length;
            System.out.print(q[idx]+" ");
        }
    System.out.println();
}
}

    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Queue s=new Queue();
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
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();
			System.out.println(s.size()+" "+s.peek());
		System.out.println(	s.pop());
		
	}
}


