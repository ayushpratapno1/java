import java.util.Scanner;
public class twenty_six {
    public static void main(String[] args){
        // Print sum of numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum +=i; // this line adds the current value of i to sum
            i++; // this line increments i by 1
        }
        System.out.println("The sum of numbers from 1 to "+n+" is: "+sum);
        // close the scanner
        sc.close();
    }
}
