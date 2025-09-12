import java.util.*;
public class thirty_eight {
    public static void main(String[] args){
        // Print the multiplication table of n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
        // closing the scanner
        sc.close();
    }
}
