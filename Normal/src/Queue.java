
public class Queue<T> 
{
	Object ar[]=new Object[100];
	int front;
	int rear;
	int size;
	public void enQueue(T data)
	{
		ar[rear]=data;
		rear++;
		size++;
	}
	public T deQueue()
	{
		T data=(T) ar[front];
		front++;
		return data;
		
	}
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]+" ");
		}
	}

}
