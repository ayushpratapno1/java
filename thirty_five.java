import java.util.*;
public class thirty_five {
    public static void main(String[] args) {
        // Checking all the number Primt or not in a range by taking range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of checking the nums are prime or not: ");
        int num = sc.nextInt();
                for(int i = 2; i<=num; i++){
                boolean isprime = true;
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i % j == 0){
                        isprime = false;
                        break;
                    }
                }
                if (isprime) {
                    System.out.printf("%d is a Prime number.\n",i);
                }
                
            }
        
        // Closing the scanner
        sc.close();
    }
}
