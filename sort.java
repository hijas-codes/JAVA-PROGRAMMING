import java.util.*;
public class sort{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
String s = scanner.nextLine();
char[] charArray = s.toCharArray();
Arrays.sort(charArray);
String sorted = new String(charArray);
 System.out.println("Sorted string: " + sorted);
    }
}

