package com.bridgelabz.Datastructures;

import java.util.List;

public class Stack<T> 
{
	 
	        int top; 
	        Object stack[] = new Object[6]; 
	  
  public  void push(Object data)  
	        { 
	            if (isFull() ) 
	            { 
	                System.out.println("Stack full"); 
	            }  
	            else 
	            { 
	                stack[top] = data;
	                top++;
	            } 
	        } 
  public void pushAll(List<T> list)
  {
	  for(int i=0;i<list.size();i++)
	  {
		  push(list.get(i));
	  }
  }
  
	  
	       public void  pop()  
	        { 
	            if (isEmpty())  
	            { 
	                System.out.println("Underflow error"); 
	                
	            }  
	            else 
	            { 
	            	 top--;
	                 stack[top]=0; 
	                 
	                
	            } 
	        } 
	       
	       public void show() {
	   		for (Object num : stack) {
	   			System.out.print(num + " ");
	   		}
	   		System.out.println();
	       }
	       
	       public int size() 
	       {
	   		return top;
	      	}
	  
	        boolean isEmpty()  
	        { 
	            return top == 0; 
	        } 
	        
	        public boolean isFull() {

	    		return top == stack.length;
	    	}
	        
	        Object peek()
	        {
	        	T data;
	    		data = (T) stack[top - 1];
	    		return data;
	        	
	        }
	        

}
