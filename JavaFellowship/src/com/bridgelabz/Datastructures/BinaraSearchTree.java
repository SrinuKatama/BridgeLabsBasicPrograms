package com.bridgelabz.Datastructures;

public class BinaraSearchTree 
{
	public Node1 insert(Node1 node,int val)
	{
		if(node == null)
		{
			return createNewnode(val);
			
		}
		else
		{
			if(val < node.data)
			{
				node.left=insert(node.left,val);
				
			}
			else if(val >node.data)
			{
				node.right=insert(node.right,val);
				
			}
			
			return node;
		}
	}
	public Node1 createNewnode(int val)
	{
		Node1 a=new Node1();
		a.data=val;
		a.left=null;
		a.right=null;
		return a;
	}
	
	public void inorder(Node1 node)
	{
		if(node==null)
		{
		}
		else
		{
			inorder(node.left);
			System.out.print(node.data+" ");
			
			inorder(node.right);
		}
	}

}
