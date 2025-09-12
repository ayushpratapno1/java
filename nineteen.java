import java.util.Scanner;
public class nineteen {
    public static void main(String[] args){
        // Checking the temperature for fever
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your body temperature:");
        double temp = sc.nextDouble();
        if (temp >= 100.4){
            System.out.println("You have a fever.");
        }else{
            System.out.println("You don't have a fever.");
        }
        // closing the scanner
        sc.close();
    }
}
