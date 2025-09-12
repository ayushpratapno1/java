import java.util.*;
public class fourtee_one {
    public static void main(String[] args){
        // Print half Pyramid by numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines do you want to print: ");
        int lines = sc.nextInt();
        for (int i = 1; i<=lines; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // closing scanner
        sc.close();
        }
}
