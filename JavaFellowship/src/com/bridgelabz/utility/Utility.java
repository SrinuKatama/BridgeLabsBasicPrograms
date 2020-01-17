package com.bridgelabz.utility;

import java.util.Random;
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

//..................SumofTriplets.........................//

public static void touple()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<=n-1;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<=n-2;i++)
	{
		for(int j=0;j<=n-1;j++)
		{
			for(int k=0;k<=n;k++)
			{
				if(ar[i]+ar[j]+ar[k] == 0)
				{
					System.out.println("The Triplets are :"+ar[i]+","+ar[j]+","+ar[k]);
				}
				
			}
		}
	}
	
	
	System.out.println("no triplets are present ");
	
}

//........................Distance of points..................//


public static void DistanceOfPoints() {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the  X value");
	int x=sc.nextInt();
	System.out.println("Enter the Y value ");
	int y=sc.nextInt();
	
	
	
	double d=((x*x)+(y*y));
	
	System.out.println("Distance between the points is: "+Math.sqrt(d));
	
	
}


//..............Quadratic.......................//

public static void Quadratics() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a=sc.nextInt();
	System.out.println("Enter the value of b");
	int b=sc.nextInt();
	System.out.println("Enter the Value of c");
	int c=sc.nextInt();
	
	
	double delta=(b*b)-(4*a*c);
	
	double x1=(-b+Math.sqrt(delta))/(2*a);
	double x2=(-b-Math.sqrt(delta))/(2*a);
	
	System.out.println("your Quadratic formula for positive sign is " +x1);
	
	System.out.println("your Quadratic formula for negative sign is " +x2);
	
}

//.............Windchill.............//


public static void Wind()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Tempertate in Fahrenheit ");
	int t=sc.nextInt();
	System.out.println("Enter the  miles per hour ");
	int v=sc.nextInt();
	
	double W=35.74+(0.6215*t)+((0.4275*t)-35.75)*(Math.pow(v, 0.16));
	if(t<50 && (v<120 && v>3))
	{
	System.out.println(W);
	}
	
	else
	{
	System.out.println("enter correct values");
	}
}
//...................Gambler..................//

public static void gamblers() 
{
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the goal ");
	int goal=sc.nextInt();//get the value from the user to raech the goal state
	Random rn=new Random();
	//int goal=10;
	int win=0;
	int loose=0;
	int toss=0;
	int amount=0;
	
	while(amount<goal) {	
		toss++;
		System.out.println("Enter your betting number 1 to 6");
		int b=sc.nextInt();
		
		System.out.println("press any key to toss ");
		sc.nextLine();
		int r=rn.nextInt(6)+1;
		System.out.println(r);
		if(b==r) {
			win++;
			amount=amount+r;
			System.out.println(amount);
			if(amount>goal) {
				amount=amount-r;
				System.out.println(amount);
			}
		}	
		else {
			loose++;
		}
	}
	
int pw=(win*100)/toss;
int pl=(loose*100/toss);
	
	
	System.out.println("win percentage out of toss is "+pw);
	System.out.println("loose percentage out of toss "+pl);
	
	// show  user to all the values 
	System.out.println("win==========>"+win);
	System.out.println("loose========>"+loose);
	System.out.println("amount========>"+amount);
	System.out.println("toss===========>"+toss);
	

}




}























