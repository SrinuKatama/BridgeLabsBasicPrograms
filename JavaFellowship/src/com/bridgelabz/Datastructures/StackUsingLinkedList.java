package com.bridgelabz.Datastructures;

public class StackUsingLinkedList <T>
{
	LinkedList<T> stack=new LinkedList<T>();
	
	int top=0;
	public void push(T data)
	{
		stack.add(data);
		top++;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else {
		stack.deleteAt(top);
		top--;
	}
	}
	
	public void show()
	{
		stack.show();
	}
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	public int size()
	{
		return top;
	}
	public T peek()
	{
		return stack.get(top);
	}

}
