import java.util.*;
public class thirty_four {
    public static void main(String[] args){
        // Checking given num is a Prime or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it's a Primt or not: ");
        int n = sc.nextInt();
        if (n<=1){
            System.out.printf("%d is not a Prime number.\n",n);
        }
        else{
            boolean isprime = true;
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime = false;
                }
            }
        if(isprime==true){
            System.out.printf("%d is a Prime number.\n",n);
        }
        else{
            System.out.printf("%d is not a Prime number.\n",n);
        }
    }
       // Closing scanner
       sc.close();
    }
}
