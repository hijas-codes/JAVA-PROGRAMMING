import java.util.Scanner;


class EvenException extends Exception {
    EvenException(String s) {
        super(s);
    }
}


class OddException extends Exception {
    OddException(String t) {
        super(t);
    }
}

public class NumberChecker {

    
    static void even(int n) throws EvenException, OddException {
        if ((n % 2) == 0) {
            throw new EvenException("Number is even");
        } else {
            throw new OddException("Number is odd");
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = sc.nextInt();

        try {
            even(n);  
        } catch (EvenException e) {
            System.out.println("Caught exception: " + e.getMessage());  
        } catch (OddException e) {
            System.out.println("Caught exception: " + e.getMessage());  
        }

        sc.close();  
    }
}

