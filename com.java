import java.util.*;
class com{
int r,i;
com(int r,int i)
{
this.r=r;
this.i=i;
}
void sum(com c1,com c2)
{
int a,b;
a=c1.r+c2.r;
b=c1.i+c2.i;
System.out.println("sum="+a+"+"+b+"i");
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int r1,r2,i1,i2;
System.out.println("Enter the real part of first number:");
r1=s.nextInt();
System.out.println("Enter the img part of first number:");
i1=s.nextInt();
com c1=new com(r1,i1);
System.out.println("Enter the real part of second number:");
r2=s.nextInt();
System.out.println("Enter the img part of second number:");
i2=s.nextInt();
com c2=new com(r2,i2);
com c3=new com(0,0);
c3.sum(c1,c2);
}}


