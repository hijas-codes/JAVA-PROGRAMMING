import java.util.*;
class exp{
public static void main(String args[])
{
try {
   int result = 10 / 0; 
    System.out.println("This line will not be executed if an exception occurs");
}
catch (ArithmeticException e) 
{
  System.err.println("Error: Division by zero is not allowed.");
 } 
finally 
{
    System.out.println("Finally block executed.");
}
}
}
