import java.util.Scanner;
class man
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String a,b,c;
		System.out.print("Enter a string:");
		a=s.next();
		System.out.print("Enter another string:");
		b=s.next();
		c=a+" "+b;
		System.out.println("Length of 1st String: " + a.length());
		System.out.println("Length of 2nd String: " + b.length());
		System.out.println("Concatenate of Strings: " +c);
		System.out.println("Conversion to UpperCase: " + c.toUpperCase());
		System.out.println("Conversion to LowerCase:" + c.toLowerCase());
	}
}
