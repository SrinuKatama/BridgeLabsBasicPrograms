package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	private static Scanner sc;
	private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	static
	{
		sc=new Scanner(System.in);
	}
	//to read integer.
	public static  int readInt()
	{
		return sc.nextInt();
	}
	//to read long integer.
	public static long readlong()
	{
		return sc.nextLong();
	}
	//to read String.
	public static String readString()
	{
		return sc.nextLine();
	}
	//to read String buffer.
	public static String bufferScanner() throws IOException
	{
	return br.readLine();
	}
	//to read double.
	public static  double readdouble()
	{
		return sc.nextDouble();
	}
	//to read boolean.
	public static  boolean readBoolean()
	{
		return sc.nextBoolean();
	}

	//.................Replace string..................
	
	public static String replace(String s)
	{
		String y="Hello <<UserName>>, How are you? "; 
			return y=y.replace("<<UserName>>",s);
		
	}
	//..........Flipcoin....................

	public static double[] flip(int n)
	{   
		          double count1=0,count2=0;
		          for(int i=0;i<n;i++)
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
		          double total=count1+count2;
		          double headper=(count1/total)*100;
		          
		         double tailper=(count2/total)*100;
		         double ar[]=new double [2];
		         ar[0]=headper;
		         ar[1]=tailper;
				
					return ar;	
		          
	   }

//..................Poweroftwo....................

public static int[] power(int n)
{
	
	int power=1;
	int i=0;
	int ar[]=new int[n+1];
	while(i<=n)
	{
		power=power*2;
		ar[i]=power;
		i++;
		
	}
	return ar;
	
	
	
}

//....................Harmonic.............

public static float harmonicSeries(int n)
{
	
	float h=1;
	for(int i=2;i<=n;i++)
	{
		h+=(float)1/i;
	}
	return h;
}

//.................Factors...............

public static int factors(int n)
{
	
	int fact=1;
	int i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;
}
//...........................2DArray.....................

public static int[][] twoDArrayImplementation(int m,int n)
{
	

	int ar[][] = new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=Utility.readInt();
			
		}
	}
	return ar;
	
	
	
	
}
//........2DDoubleArray...................

public static double[][] twoDdoubleArray(int m,int n)
{

	double[][] ar = new double[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=Utility.readdouble();
			
		}
	}
	return ar;
}

//..................SumofTriplets.........................//

public static String touple(int ar[])
{
		
	for(int i=0;i<ar.length-2;i++)
	{
		for(int j=0;j<ar.length-1;j++)
		{
			for(int k=0;k<ar.length;k++)
			{
				if(ar[i]+ar[j]+ar[k] == 0)
				{
					String  s=""+ar[i]+ar[j]+ar[k];
					return s;
				}
				
			}
		}
	}
	return null;

}

//........................Distance of points..................//


public static double DistanceOfPoints(int x,int y) 
{
	
	
	
	double d=((x*x)+(y*y));
	double distance=Math.sqrt(d);
	return distance;
}


//..............Quadratic.......................//

public static double[] Quadratics(int a,int b,int c) 
{
    double[]  ar=new double[2];
    
	double delta=(b*b)-(4*a*c);
	double x1=(-b+Math.sqrt(delta))/(2*a);
	double x2=(-b-Math.sqrt(delta))/(2*a);
	ar[0]=x1;
	ar[1]=x2;
	return ar;
	
	
}

//.............Windchill.............//


public static double Wind(int v,int t)
{
	
	
	double W=35.74+(0.6215*t)+((0.4275*t)-35.75)*(Math.pow(v, 0.16));
	
	return W;
	
	
	
}
//...................Gambler..................//

public static int[] gamblers(int stake, int goal, int n) 
{
	int ar[]=new int[3];
	int win=0,loss=0,i=0;
	while((i!=n)&&(stake!=goal))
	{
	if(Math.random()<0.5)
	{
		win++;
		stake++;
	}
	else
	{
		loss++;
		stake--;
	}
	i++;
	}
	int wp=(win*100)/n;
	int lp=(loss*100)/n;
	ar[1]=wp;
	ar[2]=lp;
	ar[0]=win;
	return ar;
	
}

//..............coupon............................


public static int[] coupan(int a[]) 
{
	
	
	
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
	return a;
	
	
}
//...........stopwatch.............



public static long stop()
{
	
		return	Instant.now().toEpochMilli();	
}
	
	



//...........Tic toe game...........................




//................BinarySearch...........................



public static int binary( String[] arr,String x)
{
	 int l = 0, r = arr.length - 1;
	 int re=0;
     while (l <= r)
     { 
         int m = l + (r - l) / 2;
         int res = x.compareTo(arr[m]);  
         if (res == 0)
         {
             re=m;
             break;
         }
          else if(res > 0) 
          {
             l = m + 1;
          }
         else
             r = m - 1; 
     } 
     return re; 
}


//.............BoubleSort..............


public static int[] bubble(int ar[],int n)
{
   
     
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
     return ar;
    
}


//............InsertionSort..................

public static int[] insertion(int ar[],int n)
{
	     int item;
	     int i=0,j=0;
	     for( i=1;i<=n-1;i++)
	     {
	    	 item=ar[i];
	    	 for( j=i-1;j>=0 && ar[j]>item;j--)
	    	 {
	    			ar[j+1]=ar[j]; 
	    		 
	    	 }
	    	 ar[j+1]=item;
	     }
	     return ar;
	       
	         
}

	//...............MergeSort............


public static int[] merge(int arr[], int l, int m, int r) 
{ 
    int n1 = m - l + 1; 
    int n2 = r - m;  
    int L[] = new int [n1]; 
    int R[] = new int [n2]; 
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    }
    return arr;
} 
	    void sort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        int m = (l+r)/2; 
        sort(arr, l, m); 
        sort(arr , m+1, r); 
        merge(arr, l, m, r); 
    } 
} 
	 
 
 //............Anagram.............
 
 
 public static boolean isAnagram1(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
		
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
  
  public static boolean isPalindrome(int n)
  {
	  int x=n,reversed=0;
		while(x!= 0) {
	        int digit = x % 10;
	        reversed = reversed * 10 + digit;
	        x /= 10;
		}
		if( n==reversed)
			return true;
		return false;
	  
  }
  
  
  
  //.................Find Number..............
  
  
  public static void findnum(int[] ar)
  {
	  Scanner sc=new Scanner(System.in);
	  int l=0, r=ar.length;
	  
	  while(l<=r)
	  {
		  int m=l+r/2;					
		 
		  System.out.println("if "+ar[m]+" is your number enter 1 else 0");

			int x=sc.nextInt();
			if (x==0)
			{
				System.out.println("if your number greater than "+ar[m]+" enter 1 else 0");
				int y=sc.nextInt();
				if (y==1)
				{
				      l = m - 1;
				      
				}
			  else
			  {
			      r = m + 1;
			  }
			}
			else 
			{
				System.out.println("number found "+ar[m]);
				break;
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
			  System.out.println(ar[i]+" notes:"+x);
			  
			  
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
  
  public static void tobin(int n)
	{
		int[] binnum=new int[1000];
		int i=0;
		while(n>0)
		{
			binnum[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(binnum[j]);
			
	}
  //.............DayofWeek...............
  
  public static int  dayofweek(int m,int y)
	{
		int y1,x,m0,d0;
		y1=y-((14-m)/12);
		x=y1+y1/4-y1/100+y1/400;
		m0=m+(12*((14-m)/12)-2);
		d0=(1+(x*31*m0)/12)%7;
		int day=(int)d0;
		return day;
			
	}
  //...........Calender...............
  
  public static void calender(int month,int year)
  {
  int[][] monthCalender=new int[6][7];
  
  // monthCalender[0][0]="Sun";monthCalender[0][1]="Mon";monthCalender[0][2]="Tues";monthCalender[0][3]="Wed";monthCalender[0][4]="Thu";monthCalender[0][5]="Fri";monthCalender[0][6]="Sat";
  int len=Integer.valueOf(year).toString().length();
  boolean leap=leapYear(year);
  
  if(month<1||month>12 || len!=4)
	  
  System.out.println("Invalid date");
  else
  {
  int day=findDayOfTheWeek(month,year);
  int daysinmonth=findNoOfDaysInMonth(month,leap);
  
  int d=0,w=0;
  while(d<daysinmonth)
  {
  if(d==0)    // for putting zeros in array
  {
  for(int i=0;i<7;i++)
  {
  if(i<day)    //for putting zeros in an array
  monthCalender[w][i]=0;
  else
  monthCalender[w][i]=++d;     //Start the putting months days or putting numeric in first row;
  } 
  }
  else
  {
  int j=0;
  while(j<7 && d<daysinmonth) //from second row onwards
  {
  monthCalender[w][j]=++d;      
  j++;
  }
  }
  w++;     //increasing the rows
  }
  //for printing purpose
  System.out.println("Sun Mon Tue Wed Thu Fri Sat");
  for(int i=0;i<6;i++)
  {
  for(int j=0;j<7;j++)
  {
  if(monthCalender[i][j]==0)
  System.out.print("    ");
  else
  System.out.printf("%-4d",monthCalender[i][j]);
  }
  System.out.println();
  }
  }
  }
  
  public static int findDayOfTheWeek(int month,int year)
  {
  int y0=0;
  int  x=0;
  int m0=0;
  int d0=0;
  y0 = year-(14 -month) / 12;
  x=y0+y0/4-y0/100+y0/400;
  m0=month+12*((14-month)/12)-2;
  d0=(1+x+31*m0/12)%7;
  return d0;
  }
  
  public static int findNoOfDaysInMonth(int month,boolean leap)
  {
  if(leap==true && month==2)
  return 29;
  else if(leap==false && month==2)
  return 28;
  else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
  return 31;
  else
  return 30;
  }
  
public static boolean leapYear(int year)
{
	return ((year%4==0 && year%100 !=0) || year%400==0);
}

  
}
  
  
  
  
 

 

























