package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
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

//..............coupan............................


public static void coupan() 
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Size of the array");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<a.length;i++)
	{
		
		Random rn=new Random();
		int r=rn.nextInt(9);//it generate the random number
		a[i]=r;
		
	 for (int j=0;j<i;j++)
     {
         if (a[i] == a[j])//if the jvm generate number is already present. i value is getting decreased
         {
             i--;
         }
     }			
	}
	
	for(int i=0;i<a.length;i++) 
	{
		System.out.print(a[i]);
	}
}
//...........stopwatch.............



public static void stop()
{
	
	Scanner sc=new Scanner(System.in);
	
	long Start=0,end=0;
	
	boolean flag=false;
	
	while(true) {
		
		System.out.println("Enter 0 for start the watch or Enter 1 for stop the watch" );
		Byte b=sc.nextByte();
		
		
		if(b==0)
		{
			Start=Instant.now().toEpochMilli();
		
			flag=true;
		    }
		
		   else if(b==1 && flag)
		   {
			
			end=Instant.now().toEpochMilli();
			break;
			
		}
	}
	
	System.out.println((end-Start)/1000+" seconds ");

}

//...........Tic toe game...........................




//................BinarySearch...........................



public static int binary(int key, int[] ar)
{
	int low=0,high=ar.length-1;
	int mid=(low+high)/2;
	
	while(low<=high)
	{
		if(key==ar[mid])
		{
			return mid;
		}
		
		else if( ar[mid]<key)
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
	
	}
	
	return -1;
	
}


//.............BoubleSort..............


public static void bubble()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("plz enter size of an array");
     int n=sc.nextInt();
     int ar[]=new int [n];
     System.out.println("plz enter array elements");
     for(int i=0;i<n;i++)
     {
    	 ar[i]=sc.nextInt();
     }
     
     int i=0,j=0,temp;
     for(i=0;i<n-1;i++)
     {
	for(j=0;j<n-1-i;j++)
     {
		if(ar[j]>ar[j+1])
		{
			temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			
		}
    	 
     }
	
     }
     System.out.println("After sorting :");

 	for(int i1=0;i1<ar.length;i1++)
 	{
 		System.out.println(ar[i1]+" ");
 		
 	}
}


//............InsertionSort..................

public static void insertion()
{
	Scanner sc=new Scanner(System.in);
	   System.out.println("plz enter size of an array");
	     int n=sc.nextInt();
	     int ar[]=new int [n];
	     System.out.println("plz enter array elements");
	     for(int i=0;i<n;i++)
	     {
	    	 ar[i]=sc.nextInt();
	     }
	     int item;
	     int i=0,j=0;
	     for( i=1;i<=ar.length-1;i++)
	     {
	    	 item=ar[i];
	    	 for( j=i-1;j>=0;j--)
	    	 {
	    		 if(ar[j]>item)
	    		 {
	    			ar[j+1]=ar[j]; 
	    		 }
	    	 }
	    	 ar[j+1]=item;
	     }
	     System.out.println("After searching :");
	     for(int k=0;k<=ar.length-1;k++)
	     {
	    	System.out.print(ar[i]+" ");
	     }    
	         
}

	//...............MergeSort............


public static void merge(int ar[],int low,int mid,int high)
{
	int n1=mid-low+1;
	int n2=high-mid;
	
	int L[]=new int[n1];
	int R[]=new int[n2];
	
	for (int i=0; i<n1; ++i) 
        L[i] = ar[low + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = ar[mid + 1+ j];
    
    
    int i = 0, j = 0; 
    
    int k = low; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            ar[k] = L[i]; 
            i++; 
        } 
        else
        { 
            ar[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    while (i < n1) 
    { 
        ar[k] = L[i]; 
        i++; 
        k++; 
    } 

    while (j < n2) 
    { 
        ar[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
    
 public void sort(int ar[],int low ,int high)
{
	if(low<high)
	{
    int mid=low+high/2;
	sort(ar,low,mid);
	sort(ar,mid+1,high);
	merge(ar,low,mid,high);
	}
}
 public static void printArray(int ar[]) 
 { 
     int n = ar.length; 
     for (int i=0; i<n; ++i) 
         System.out.print(ar[i] + " "); 
     System.out.println(); 
 } 


 
 //............Anagram.............
 
 
 public static void anagram()
 {
	 String s1="listen";
	 String s2="silent";
	 
	 char[] ar1=s1.toCharArray();
	 char[]  ar2=s2.toCharArray();
	 
	 Arrays.sort(ar1);
	 Arrays.sort(ar2);
	 
	 Boolean result=Arrays.equals(ar1,ar2);
	 
	 if(result==true)
	 {
		 System.out.println("given strings are anagrams ");
	 }
	 else 
	 {
		 System.out.println("given strings are not anagrams ");;;
	 }
 }
 
 
 
 //...............primenumber.............
 
 
  public static void prime() 
  {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int ar1[]=new int[n];
	 if(n<=100)
	 {
		 
		 int i=0,j=0,s;
		for( i=2;i<n;i++)
		
		 {
			s=0;
			 for(j=2;j<i;j++)
			 {
				 if(i%j==0)
				 {
					 s=1;
				 }
				 break;
			 }
			 if(s==0)
			 {
				 
				 System.out.println(i);
				 
			
			 }
		 }
	 }
	 else
	 {
		 System.out.println("enter no. between range");
	 }
	
	
     
  
  }
  
  
  
  //.............isPrime.....................
  
  
  public static boolean isPrime(int num)
  {
		if (num == 0 || num == 1) 
		{
			return false;
		}
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;	 
 }
  
  
  
  //..............isAnagram.........................
  
  
  
  public static boolean isAnagram(String str1, String str2)
  {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		if (str1.length() != str2.length()) 
		{
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2))
			{
				return true;
			}
		}
		return false;
	}
  
  
  //....................isPalindrome...............
  
  public static boolean isPalindrome(int num)
  {
	  int reverse=0,rem,revnum = 0;
	  while(num!=0)
	  {
	     rem=num%10;
	     revnum=reverse*10+rem;
	     num=num/10;
	  }
	  if(num == revnum )
	  {
		  return true;
		  
	  } 
	  else
	  {
		  return false;
	  }
	  
  }
  
  
  
  //.................Find Number..............
  
  
  public static void findnum(int[] ar)
  {
	  Scanner sc=new Scanner(System.in);
	  int l=0, r=ar.length;
	  
	  while(l<=r)
	  {
		  int m=l+(r-1)/2;					
		 
		  System.out.println("if "+ar[m]+" is your number enter 1 else 0");

			int x=sc.nextInt();
			if (x==0)
			{
				System.out.println("if"+ar[m]+"is less than your number enter 1 else o");
				int y=sc.nextInt();
				if (y==1)
				{
				      l = m + 1;
				}
			  else
			  {
			      r = m - 1;
			  }
			}
			else 
			{
				System.out.println("number found "+ar[m]);
			}
		  
	  }
  }
  
  
  //.......................calculator.........
  
  public static int calc(int x,int y)
  {
	 int c=x+y;
	  return c;
  }
  
  
  //................BinaryTesting..........
  
  public static int Bin(int n) {
		
		int rem,b=0,i=1;
		while(n>0) {
		rem=n%2;
		n/=2;
		b+=rem*i;
		i*=10;
		}
		return b;
	}
  
  //.............VendingMechine.................
  
  
  public static int vend(int cash)
  {
	  int ar[]=new int[]{1000,500,100,50,10,5,2,1};
	   int count=0;
	  for(int i=0;i<ar.length;i++)
	  {
		  if(cash>=ar[i])
		  {
			  int x=cash/ar[i];
			  cash=cash%ar[i];
			  count++;
			  System.out.println("cash reqires:"+x+"*"+ar[i]);
			  
		  }
	  }
	  return count;
	  
	  
  }
  
  //...............readLine................
  
  public String readFile(String path) throws IOException
  {
	  String s="";
	  BufferedReader br=new BufferedReader(new FileReader(path));
	  s=br.readLine();
	  br.close();
	  return path;
	  
  }
  public String writeFile(String path,String s) throws IOException
  {
	  BufferedWriter br=new BufferedWriter(new FileWriter(path));
	  br.write(s);
	  br.close();
	   return "\n file is written";
  }
  
  }
  
  
  
  
 

 

























