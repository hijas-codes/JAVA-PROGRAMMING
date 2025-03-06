import java.util.*;

class Employee {
    int eNo;
    String eName;
    double salary;
    Employee(int eNo, String eName, double salary) {
        this.eNo = eNo;
        this.eName = eName;
        this.salary = salary;
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the number of Employees:");
        int n = sc.nextInt();  

        Employee[] a = new Employee[n];  

       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of employee " + (i + 1));
            
            System.out.println("Enter ID:");
            int eNo = sc.nextInt();  
            
            sc.nextLine();  
            
            System.out.println("Enter Name:");
            String eName = sc.nextLine();  
            
            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();  

           
            a[i] = new Employee(eNo, eName, salary);
        }

       
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee ID: " + a[i].eNo + ", Name: " + a[i].eName + ", Salary: " + a[i].salary);
        }
    }
}























