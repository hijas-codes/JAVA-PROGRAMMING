import java.util.Scanner;
class sym{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int m,n;
System.out.println("Enter Number Rows of the matrix:");
 m=s.nextInt();
System.out.println("Enter number of columns of the matrix:");
n=s.nextInt();
int a[][]=new int[m][n];
System.out.println("Enter the Matrix Elements:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
 a[i][j]=s.nextInt();
 }
 }
 System.out.println("Matrix");
   for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   { 
   System.out.print(a[i][j]+" ");
   }
   System.out.println(" ");
   }
   if(m!=n)
   {
   System.out.println("Its is not a Sqare matrix !!!,So It can't be symmetric");
 }
 else
 {
 boolean Symmetric=true;
 for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   { 
   if(a[i][j]!=a[j][i])
   {
   Symmetric=false;
   break;
   }}}
   if(Symmetric)
   {
   System.out.println("Symmetric Matrix");
   }
   else
   {
   System.out.println("Not Symmetric ");
   }
   }
   s.close();
   }
   
 }
