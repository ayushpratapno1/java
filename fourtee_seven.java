import java.util.*;
public class fourtee_seven {
    // Swap two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        num2 = num2 + num1;
        num1 = num2-num1;
        num2 = num2-num1;
        System.out.println("After swap first number is "+num1);
        System.out.println("and second number is "+num2);
        sc.close();
    } 
}
