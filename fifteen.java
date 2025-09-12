import java.util.Scanner;
public class fifteen {
    public static void main(String[] args){
        // Finding largest in 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.printf("The largest number is: %d\n", num1);
        }else if (num2>num1 && num2>num3){
            System.out.printf("The largest number is: %d\n", num2);
        }else{
            System.out.printf("The largest number is: %d\n", num3);
        }
        //Closing scanner
        sc.close();
    }
}
