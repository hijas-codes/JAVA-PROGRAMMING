import java.util.Scanner;
class mad{
public static void main(String args[]){
 int p,q,m,n;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter Number of rows of first matrix:  ");
 p=s.nextInt();
 System.out.print("Enter Number of columns of first matrix:  ");
 q=s.nextInt();
 System.out.print("Enter Number of rows of second matrix:  ");
 m=s.nextInt();
 System.out.print("Enter Number of columns of second matrix:  ");
 n=s.nextInt();
 if(p==m&&q==n)
 {
  int a[][]=new int[p][q];
  int b[][]=new int[m][n];
  int c[][]=new int[m][n];
  System.out.println("Enter All elements of first matrix:  ");
  for(int i=0;i<p;i++)
  {
   for(int j=0;j<q;j++)
   { 
   a[i][j]=s.nextInt();
   }
   }
   System.out.println("Enter All elements of second matrix:  ");
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   { 
   b[i][j]=s.nextInt();
   }
   }
   System.out.println("First matrix");
   for(int i=0;i<p;i++)
  {
   for(int j=0;j<q;j++)
   { 
   System.out.print(a[i][j]+" ");
   }
   System.out.println(" ");
   }
   System.out.println("second matrix");
   for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   { 
   System.out.print(b[i][j]+" ");
   }
   System.out.println(" ");
   }
   for(int i=0;i<m;i++)
  	{
   	for(int j=0;j<n;j++)
   		{ 
   		for(int k=0;k<q;k++)
   		{
   		c[i][j]=a[i][j]+b[i][j];
   		}
   		}
   		}
   		System.out.println("Matrix After addition   :");
   		for(int i=0;i<m;i++)
  		{
   		for(int j=0;j<n;j++)
   		{ 
   		System.out.print(c[i][j]+" ");
   		}
   		System.out.println(" ");
   			}
   	}
    else
    		{
    	 System.out.println("Addition Not Possible!!!!");
    	 
    	 
    	        }
    }
    }
   
