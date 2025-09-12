import java.util.Scanner;
public class fourteen {
    public static void main(String[] args){
        // Calculate salary with tax range
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        double tax;
        if (salary<=500000){
            tax = 0;
            System.out.printf("Your salary after tax: %.2f\n", (salary - tax));
        }else if (salary<=1000000){
            tax = salary*0.2;
            System.out.printf("Your salary after tax: %.2f\n", (salary - tax));
        }else{
            tax = salary*0.3;
            System.out.printf("Your salary after tax: %.2f\n", (salary - tax));
        }
        System.out.printf("Your tax is: %.2f\n", tax);
        // Closing the scanner
        sc.close();
    }
}
