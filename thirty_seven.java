import java.util.*;
public class thirty_seven {
    public static void main(String[] args){
        // Find the factorial of given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial of number is: "+fact);
        // closing the scanner
        sc.close();
    }
}
