
import java.util.Scanner;

public class progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Java Calculator");
        System.out.println("----------------------");
        
        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("\nChoose an operation (1-5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
            
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            String operation = "";
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "/";
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
            }
            
            System.out.printf("\nResult: %.2f %s %.2f = %.2f\n", num1, operation, num2, result);
        }
        
        scanner.close();
    }
}
