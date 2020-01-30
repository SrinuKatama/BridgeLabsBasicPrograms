package com.bridgelabz.Datastructures;

public class BST_Runnable 
{
	public static void main(String[] args)
	{
		BinaraSearchTree bs=new BinaraSearchTree();
		Node1 root=null;
		bs.insert(root, 8);
		bs.insert(root, 3);
		bs.insert(root, 10);
		bs.insert(root, 1);
		bs.insert(root, 6);
		bs.insert(root, 4);
		bs.insert(root, 7);
		bs.insert(root, 14);
		bs.insert(root, 13);
		
		bs.inorder(root);
	}
};


