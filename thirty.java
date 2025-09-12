import java.util.*;
public class thirty {
    public static void main(String[] args){
        // Reverse given digit and save into a variable and after loop closing print the reversed digit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit to reverse the digit: ");
        int digit = sc.nextInt();
        int original_num = digit;
        int rev = 0;
        while(digit!=0){
            int reverse = digit%10;
            rev = (rev * 10) + reverse;
            digit/=10;
        }
        System.out.printf("Reverse of %d is %d",original_num,rev);
        // close scanner
        sc.close();
    }
}
