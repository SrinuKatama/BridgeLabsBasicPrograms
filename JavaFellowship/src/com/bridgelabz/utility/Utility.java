package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{
	//.................Replace string..................
	public static String replace()
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()<3)
		{
			System.out.println("String length must be greater than 3 ");
		}
		return s;	
	}
	//..........Flipcoin....................

	public static void flip()
	   {
		
		   Scanner sc=new Scanner(System.in);
		          int n=sc.nextInt();
		          
		          int count1=0,count2=0;
		          for(int i=0;i<=n;i++)
		          {
		        	  if(Math.random()<0.5)
		        	  {
		        		  count1++;
		        	  }
		        	  else
		        	  {
		        		  count2++;
		        	  }
		          }
		          int total=count1+count2;
		          double headper=(count1/total)*100;
		          
		          double tailper=(count2/total)*100;
				System.out.println("head percentage is :"+headper);
				System.out.println("tail percentage is :"+tailper);		
		          
	   }

//.....................leap year.........................



     public static void leap()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the year");
    	 int n=sc.nextInt();
    	 String s=""+n;
    	 if(s.length()==4)
    	 {
    		 if(n%4==0 && n%100!=0 || n%400==0)
    		 {
    			 System.out.println(n+" is a leap year");
    			 
    		 }
    		 else
    		 {
    			 System.out.println(n+" is not a leap year");
    		 }
    	 }
    	 else
    	 {
    		 System.out.println("please enter four digit number");
    	 }
    	 
     }



//..................Poweroftwo....................

public static void power()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the numvber");
	int n=sc.nextInt();
	int power=1;
	int i=0;
	while(i<=n)
	{
		System.out.println("2 power "+i+"is:"+power);
		
		power=power*2;
		i++;
		
	}
	
	
	
}

//....................Harmonic.............

public static void harmonic()
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	float h=1;
	for(int i=2;i<=n;i++)
	{
		h+=(float)1/i;
	}
	System.out.println("harmonic series value is:"+h);
}

//.................Factors...............

public static void factors()
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	int fact=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("factorial of "+n+"is :"+fact);
}
//...........................2DArray.....................

public static void twod()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("plz enter no.of rows and no.of coloumns");
	int m=sc.nextInt();
	int n=sc.nextInt();
	int ar[][]=new int[m][n];
	System.out.println("please enter  values");

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=sc.nextInt();
			
		}
	}
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" "+ar[i][j]);
		}
		System.out.println();
	}
}

public static void twoddouble()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("plz enter no.of rows and no.of coloumns");
	int m=sc.nextInt();
	int n=sc.nextInt();
	
	double ar[][]=new double[m][n];
	System.out.println("please enter double values");

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=sc.nextDouble();
			
		}
	}
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(" "+ar[i][j]);
		}
		System.out.println();
	}
}




















}























