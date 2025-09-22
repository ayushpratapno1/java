import java.util.*;
public class fourtee_nine {
    // Power Calculation Calculate x raised to power y
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x num: ");
        int x = sc.nextInt();
        int pow = x;
        System.out.print("Enter the power: ");
        int y = sc.nextInt();
        if (y==0){
            System.out.println(1);
        }
        else if(y==1){
            System.out.println(x);
        }
        else if(y<0){

            if(x==0){
                System.out.println("Undefined (division by zero)");
            }
            else{
                System.out.println(0);
            }
        }
        else{
            for (int i = 1; i<y; i++){
                x *= pow;
        }
        System.out.println(x);
    }
        sc.close();
    }
}
