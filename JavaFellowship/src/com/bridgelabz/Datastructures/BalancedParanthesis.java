package com.bridgelabz.Datastructures;

import java.util.Scanner;

public class BalancedParanthesis 
{
	static boolean areParanthesis(char exp[])
	{
		 Stack st=new Stack();
		 
		 for(int i=0;i<=exp.length-1;i++)
		 {
			 if(exp[i]=='(')
			 {
				 st.push(exp[i]);
			 }
			 else if(exp[i]==')')
			 {
				 st.pop();
			 }
		 }
		 
		 if(st.isEmpty()==true)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
		
	}

	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plase enrter the string");
		String s=sc.next();
		
		char exp[]=s.toCharArray()  ; 
		   
		if(areParanthesis(exp))
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
		
     }
	
      }