import java.util.Scanner;
public class twelve {
    public static void main(String[] args){
        // if-else statement
        // Checking greater in two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num:");
        // Taking input 1 from user
        int num1 = sc.nextInt();
        System.out.println("Enter your second num:");
        // Taking input 2 from user
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("The greater number is: " + num1);
        }
        else{
            System.out.println("The greater number is: " + num2);
        }
        // Closing the scanner
        sc.close();
    }
}
