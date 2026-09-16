import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total stock level: ");
        int totalStock = sc.nextInt();

        System.out.print("Enter number of warehouses: ");
        int warehouses = sc.nextInt();

        try {
            int averageStock = totalStock / warehouses;
            System.out.println("Average stock level: " + averageStock);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Number of warehouses cannot be zero.");
            System.out.println("Average stock level cannot be calculated.");
        }

        sc.close();
    }
}
