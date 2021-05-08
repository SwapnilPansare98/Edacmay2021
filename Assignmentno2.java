class Pattern1
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
			}	
			System.out.println();
		}
	}
}
//---------------------------------------------------------------
class Pattern2
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+j)+" ");
			}	
			System.out.println();
		}
	}
}
//-------------------------------------------------------------
class Pattern3
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Pattern4
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+i+" ");
			}	
			System.out.println();
		}
	}
}
//-------------------------------------------------------------
class Pattern5
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+i)+" ");
			}	
			System.out.println();
		}
	}
}
//-------------------------------------------------------------
class Pattern6
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}	
			System.out.println();
		}
	}
}
//-------------------------------------------------------------
class Pattern7
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}	
			System.out.println();
		}
	}
}
//---------------------------------------------------------------
class Pattern8
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for (int j=i;j<=5;j++)
			{
				System.out.print(" "+j);
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------------
class Pattern9
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+j));
			}	
			System.out.println();
		}
	}
}
//---------------------------------------------------------------
class Pattern10
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=5;i>=1;i--)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			for (int j=i;j<=5;j++)
			{
				System.out.print(" "+(char)(a+j));
			}	
			System.out.println();
		}
	}
}
//---------------------------------------------------------------
class Pattern11
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//----------------------------------------------------------------
class Pattern12
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}	
			System.out.println();
		}
	}
}
//-----------------------------------------------------------------
class Pattern13
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+i));
			}	
			System.out.println();
		}
	}
}
//-----------------------------------------------------------------
class Pattern14
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+j+" ");
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------------
class Pattern15
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(" "+j+" ");
			}	
			System.out.println();
		}
	}
}
//-----------------------------------------------------------------
class Pattern16
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print(" "+j+" ");
			}	
			System.out.println();
		}
	}
}
//-------------------------------------------------------------
class Pattern17
{
	public static void main(String args[])
	{
		int c=0;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				c=c+1;
				System.out.print(" "+c);
			}	
			System.out.println();
		}
	}
}
//----------------------------------------------------------
class Pattern18
{
	public static void main(String args[])
	{
		int a=64;
		for (int i=5;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)(a+j)+" ");
			}	
			System.out.println();
		}
	}
}
//---------------------------------------------------------------
class Star1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//-----------------------------------------------------------------
class Star2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star3
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star4
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			
			}
			for (int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star5
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			for (int i=5;i>=1;i--)
		    {
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star6
{
	public static void main(String args[])
	{
		for (int i=5;i>=1;i--)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star7
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{	
			   System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
     			System.out.print("*");
			}
			System.out.println();
		}
		
	    for(int i=4;i>=1;i--)
			{
			for(int j=4;j>=i;j--)
				{
					System.out.print(" ");
				}
			for(int k=1;k<=(i*2)-1;k++)
				{
					System.out.print("*");
				}
			System.out.println();
			}
				
	
	}
}
//------------------------------------------------------------	
class Star8
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star10
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=4;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star11
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=4;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star12
{
	public static void main(String []args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{	
			   System.out.print("*");
			}
			System.out.println();
		}
		
	    for(int i=2;i<=5;i++)
			{
			for(int j=i;j>=1;j--)
				{
					System.out.print("*");
				}
			System.out.println();
			}
				
	
	}
}	
//------------------------------------------------------------
class Star13
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class Star14
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star15
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Star16
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;++i)
		{
			for (int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			if (k==1 || k==i || i==5)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Pyramid1
{
	public static void main(String args[])
	{ int c = 1;
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=i;j++)
    	  {
			 System.out.print(" ");
		  }
		  for(int k=1;k<=c;k++)
		  {
		     System.out.print(c+" ");
	      }
			System.out.println();
			c++;
		}
    }
}
//------------------------------------------------------------
class Pyramid2
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			c++;
		}
	}
}
//------------------------------------------------------------
class Pyramid3
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			c++;
		}
	}
}
//------------------------------------------------------------
class Pyramid4
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=9;i>0;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=c;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=c-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
			c++;
		}
	}
}
//------------------------------------------------------------
class Pyramid5
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=9;k++)
			{
				System.out.print(k+" ");
			}
			for(int l=8;l>=i;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();
			c++;
		}
	}
}
//------------------------------------------------------------
class Pyramid6
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int j=i;j<9;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Pyramid7
{
	public static void main(String args[])
	{ 
		for(int i=9;i>=1;i--)
		{
			for(int j=8;j>=i;j--)
    	  {
			 System.out.print(" ");
		  } int c=9;
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(" "+(i));
		  }
		  
			System.out.println();
			
		}
    }
}
//------------------------------------------------------------
class Full
{
	public static void main(String args[])
	{
		for (int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Fullinverted
{
	public static void main(String args[])
	{
		for (int i=6;i>=1;i--)
		{
			for(int k=i;k<6;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class hollow
{
	public static void main(String args[])
	{
		for (int i=1;i<=6;i++)
		{
			for(int k=6;k>=i;k--)
			{if(i==1||k==i||k==6)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			for (int j=1;j<i;j++)
			{
				System.out.print(" ");
			}	
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Hollowfull
{
	public static void main(String args[])
	{
		for (int i=1;i<=6;i++)
		{
			for(int k=i;k>6;k++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1)||i==6)
				System.out.print("*");
			else
				System.out.print(" ");
			}	
			System.out.println();
		}
	}
}

//------------------------------------------------------------
class Inverted
{
	public static void main(String args[])
	{
		for (int i=1;i<=6;i++)
		{
			for (int j=6;j>=i;j--)
			{
				System.out.print(" * ");
			
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------
class Pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
//------------------------------------------------------------