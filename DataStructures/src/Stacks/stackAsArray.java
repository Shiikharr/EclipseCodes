package Stacks;

public class stackAsArray {

	public static void main(String[] args) {
		
		stackAsArray ob=new stackAsArray();
		ob.push(2);
		ob.push(6);
		ob.push(8);
		ob.show();
		ob.push(9);
		ob.push(11);
		ob.show();
		ob.pop();
		ob.show();
		ob.push(11);
		ob.show(); 
		System.out.println(ob.peek());

	}
	
	int stack[]=new int[5];
	int top=0;
	
	public void push(int data)
	{
		if(top==5)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			stack[top]=data;
			top++;
		}
	}
	
	public int pop()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("stack Underflow");
		}
		else
		{
			top--;
			data=stack[top];
			stack[top]=0;
		}
		return data;
	}
	public int peek()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			data=stack[top-1];
		}
		return data;
	}
	
	public void show()
	{
		for(int i=0;i<5;i++)
			System.out.print(stack[i]+" ");
		System.out.println();
	}
	
	public int size()
	{
		return top;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<=0;
	}

}
