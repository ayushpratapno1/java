import java.util.Scanner;
public class eighteen {
    public static void main(String[] args){
        // Checking the input number is positive or negative
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number:");
        int num = sc.nextInt();
        if (num > 0){
            System.out.printf("%d is positive.\n", num);
        }else if (num < 0){
            System.out.printf("%d is negative.\n", num);
        }else{
            System.out.printf("%d is zero.\n", num);
        }
        // closing the scanner
        sc.close();
    }
}
