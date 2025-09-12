import java.util.Scanner;
public class seventeen {
    public static void main(String[] args){
        // Example of Switch statement
        // Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter any operator (+, -, *, /, %):");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
            System.out.println("Addition is: " + (num1+num2));
            break;
            case '-':
            System.out.println("Subtraction is: " + (num1-num2));
            break;
            case '*':
            System.out.println("Multiplication is: " + (num1*num2));
            break;
            case '/':
            if (num2 == 0){
                System.out.println("Division by zero is not allowed.");
            }else{
                System.out.println("Division is: " + (num1/num2));
            }
            break;
            case '%':
            if (num2 == 0){
                System.out.println("Modulus by zero is not allowed.");
            }else{
                System.out.println("Modulus is: " + (num1%num2));
            }
            break;
            default:
            System.out.println("Invalid choice: " + operator);
        }
        // closing the scanner
        sc.close();
    }
}
