import java.util.*;
public class twenty_three {
    public static void main(String[] args){
        // Checking the number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.printf("%d is even.", num);
        }else{
            System.out.printf("%d is odd.", num);
        }
        // Closing the scanner
        sc.close();
    }
}