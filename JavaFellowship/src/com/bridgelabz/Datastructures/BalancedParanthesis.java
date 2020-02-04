package com.bridgelabz.Datastructures;

import java.util.Scanner;

public class BalancedParanthesis 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String a=sc.next();
	BalancedParanthesis b=new BalancedParanthesis();
	BalancedParanthesis.check(a);
	
	System.out.println(a+" = "+check(a));
	}
	
	 public static boolean check(String a)
	 {
	 if (a.isEmpty())
	 return true;
	 
	 Stack stack = new Stack();
	 
	 for (int i = 0; i < a.length(); i++)
	 {
	 char current = a.charAt(i);
	 if (current == '{' || current == '(' || current == '[')
	 {
	 stack.push(current);
	 }
	 if (current == '}' || current == ')' || current == ']')
	 {
	 if (stack.isEmpty())
	 return false;
	 char last = (char) stack.peek();
	 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	 stack.pop();
	 else 
	 return false;
	 }
	 }
	 return stack.isEmpty()?true:false;
	 }
      }