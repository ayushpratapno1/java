import java.util.Scanner;
public class twenty_five {
    public static void main(String[] args){
        // Print statement by taking range from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to print the numbers:");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        // close the scanner
        sc.close();
    }
}
