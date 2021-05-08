//Q=1
 
class hello
 {
    public static void main(String[] args) 
	{
        System.out.println("Hello"); 
		System.out.println("Swapnil Pansare");
    }
}




//Q=2

class addition
{
	public static void main(String args[])
	{
		int a=74,b=36,c;
		c=a+b;
		System.out.println("addition of two number="+c);
	}
}
		



//Q=3
class division
{
public static void main(String args[])
{
	int a=50,b=3,c;
	c=a/b;
System.out.println("division of number="+c);
}
}



//Q=4
class Test
{
	public static void main(String args[])
	{
		int a,b,c,d;
		a=-5+8*6;
		b=(55+9)%9;
		c=20+-3*5/8;
		d=5+15/3*2-8%3;
		System.out.println("Answer="+a);
		System.out.println("Answer="+b);
		System.out.println("Answer="+c);
		System.out.println("Answer="+d);
	}
		
}




//Q=5
import java.util.Scanner;
class Input
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		System.out.println(a+" X "+b +" = "+(a*b));
	}
}
		



//Q=6
import java.util.Scanner;
class Multiple
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		System.out.println(a+" + "+b +" = "+(a+b));
		System.out.println(a+" - "+b +" = "+(a-b));
		System.out.println(a+" X "+b +" = "+(a*b));
		System.out.println(a+" / "+b +" = "+(a/b));
		System.out.println(a+" Mod "+b +" = "+(a/b));
	}
}



//Q=7
import java.util.Scanner;
class Multitable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();
		for(int i=0;i<10;i++)
		{
			System.out.println(a+ "x" +(i+1)+" = " +(a*(i+1)));
		}
	}
}




//Q=8;
class Printjava
{
	public static void main(String args[])
	{
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=24;j++)
			{
				if (i==1 & j==4 | i==2 & j==4 | i==3 & j==4 | i==3 & j==1 | i==4 & j==2 | i==4 & j==3)
				{
					System.out.print("j");
				}
				else if (i==1 & j==8 | i==2 & j==7 | i==2 & j==9 | i==3 & j==6 | i==3 & j==7 | i==3 & j==8 | i==3 & j==9 | i==3 & j==10 | i==4 & j==5 | i==4 & j==11)
			    {
					System.out.print("a");
				}
				else if (i==1 & j==11 | i==1 & j==17 | i==2 & j==12 | i==2 & j==16 | i==3 & j==13 | i==3 & j==15 | i==4 & j==14)
				{
					System.out.print("v");
				}
				else if (i==1 & j==20 | i==2 & j==19 | i==2 & j==21 | i==3 & j==18 | i==3 & j==22 | i==3 & j==19 | i==3 & j==20 | i==3 & j==21 | i==4 & j==17 | i==4 & j==23)
				{
					System.out.print("a");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					



//Q=9
import java.util.Scanner;
class Test9
{
	public static void main(String args[])
	{
		double temp=((25.5*3.5-3.5*3.5)/(40.5-4.5));
	System.out.println(temp);
	}
}




//Q=10
import java.util.Scanner;
class Test10
{
	public static void main(String args[])
	{
		double temp=(4.0*(1-(1.0/3)+(1.0/7)-(1.0/7)+(1.0/9)-(1.0/11)));
		System.out.println(temp);
	}
}



//Q=11
import java.util.*;
class Area
{
	public static void main(String args[])
	{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of radius: ");
	       double r = sc.nextDouble();
		   double a=((3.14)*(r*r));
		   double p=(2*(3.14)*r);
		System.out.println("Area of circie = "+a);
		System.out.println("Perimeter of circle = "+p);
	}
}
		


//Q=12

import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		System.out.println("Input Third number: ");
		int c = sc.nextInt();
		int d=((a+b+c)/3);
		System.out.println("Average of three no ="+d);
	}
}




//Q=13;
import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Width= ");
		float w=sc.nextFloat();
		System.out.println("Enter Height= ");
		float h=sc.nextFloat();
		float area=w*h;
		float peri=2*(w+h);
		System.out.println("Area is "+w+" * "+h +" = "+area);
		System.out.println("Peri is 2X("+w+" + "+h+")"+" = "+peri);
	}
}
		



//Q=14
class Flag
{
	public static void main(String args[])
	{
		for(int i=1;i<=15;i++)
		{
			if(i<=9)
			{
				if(i%2==1)
				{
					System.out.println("* * * * * * ==============================");
				}
				else
				{
					System.out.println(" * * * * *  ==============================");
				}
			}
			else
			{
				System.out.println("==========================================");
			}
		}
	}
}




//Q=15
import java.util.*;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,temp;
		System.out.println("Enter First number= ");
		i=sc.nextInt();
		System.out.println("Enter second number= ");
		j=sc.nextInt();
		temp=i;
		i=j;
		j=temp; 
		System.out.println("first no swapping value=" +i);
		System.out.println("second no swapping value=" +j);
	}
}




//Q=16
class Face
{
	public static void main(String args[])
	{ int a=34;
		System.out.println(" +"+(char)(a)+(char)(a)+(char)(a)+(char)(a)+(char)(a)+"+" );
		System.out.println("[| O O |]");
		System.out.println(" |  ^  | ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
	}
}



