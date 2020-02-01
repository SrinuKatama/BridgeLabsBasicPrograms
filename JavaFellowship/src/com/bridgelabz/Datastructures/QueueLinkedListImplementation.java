package com.bridgelabz.Datastructures;

import java.util.List;

public class QueueLinkedListImplementation <T>
{
	int size;
	LinkedList queue=new LinkedList();
	
	public void enQueue(T data)
	{
		
		queue.add(data);
		size++;
	}
	public void deQueue()
	{
		if(!isEmpty())
		{
		queue.deleteAtStart();
		size--;
		}
		
	}
	public void enQueueAll(List<T> list)
	{
		for(int i=0;i<list.size();i++)
		{
			enQueue(list.get(i));
		}
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void show()
	{
		queue.show();
	}
	public T get(int index)
	{
		if(index<size)
		{
			return (T) queue.get(index);
			
		}
		return null;
	}
}
