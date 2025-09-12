import java.util.Scanner;
public class sixteen {
    public static void main(String[] args){
        // Example of Ternary Operator
        // Checking student marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        String result = (marks>=33)? "Pass" : "Fail";
        System.out.println("Your result is: " + result);
        // Closing the scanner
        sc.close();
    }
}
