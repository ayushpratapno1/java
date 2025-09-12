import java.util.*;
public class thirty_two {
    public static void main(String[] args){
        // Example of continue statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the i/p num but skip the multiple of 10 num");
        while(true){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num == -1){
                break; // For exit the loop
            }
            if(num%10 == 0){
                continue; // For skip the multiple of 10
            }
            System.out.println("Your number was "+num);
        }        
    sc.close();
}
    
}
