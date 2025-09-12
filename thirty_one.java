import java.util.*;
public class thirty_one {
    public static void main(String[] args){
        // Example of break statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num but not enter the num multiple of 10");

        do{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
        // closing the scanner
        sc.close();
    }
}
