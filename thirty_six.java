import java.util.*;
public class thirty_six {
    public static void main(String[] args){
        // reads a set of integers,and then prints the sum of the even and odd integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many integer you want to add as even or odd: ");
        int num = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;
        for(int i = 1; i<=num; i++){
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            if (n%2==0){
                sumeven += n;
            }
            else{
                sumodd += n;
            }
        }
        System.out.println("Sum of even numbers: "+sumeven);
        System.out.println("Sum of odd numbers: "+sumodd);
        // close the scanner
        sc.close();
    }
}
