package Stacks;

import java.util.Stack;

public class minStackWithoutSpace {

	public static void main(String[] args) {
		minStackWithoutSpace ob=new minStackWithoutSpace();
		ob.push(3);
		ob.push(6);
		ob.push(9);
		ob.push(12);
		ob.push(10);
		ob.push(1);
		ob.show();
		System.out.println(ob.getMin());
		ob.pop();
		System.out.println(ob.getMin());
	}

	int minEle;
    Stack<Integer> s;
    
    minStackWithoutSpace()
    {
    	s=new Stack<Integer>();
    }

    void show()
    {
    	System.out.println(s);
    }
    
    
    /*returns min element from stack*/
    int getMin()
    {
    	if(s.isEmpty()) 
    	    return -1;
    	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
    	if(s.isEmpty())
    	    return -1;
    	else
    	{
    	    if(s.peek()>=minEle)
    	        return s.pop();
    	    else if(s.peek()<minEle)
    	    {
    	        minEle=2*minEle - s.peek();
    	        return s.pop();
    	    }
    	}
		return minEle;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    if(s.isEmpty())
	    {
	        s.push(x);
	        minEle=x;
	    }
	    else
	    {
	        if(x>=minEle)
	            s.push(x);
	        else if(x<minEle)
	        {
	            s.push(2*x-minEle);
	            minEle=x;
	        }
	    }
    }	
}
