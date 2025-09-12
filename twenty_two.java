import java.util.*;
public class twenty_two {
    public static void main(String[] args){
        // Checking the year leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.printf("%d is a leap year.", year);
        }else{
            System.out.printf("%d is not a leap year.\n", year);
        }
        // Closing the scanner
        sc.close();
    }
}
