import java.util.*;
public class fourtee_eight {
    // Grade calculator: assign letter grades based on numerical scores
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter how many Grades calculate: ");
       int n = sc.nextInt();
       for( int i = 1; i<=n; i++){
        System.out.print("Enter score out of 100: ");
        int score = sc.nextInt();
        if (score>=91 && score<=100){
            System.out.println("You achieve A+ grade\n");
        }
        else if (score>=81 && score<91){
            System.out.println("You achieve A grade\n");
        }
        else if (score>=61 && score<81){
            System.out.println("You achieve B grade\n");
        }
        else  if (score>=41 && score<61){
            System.out.println("You achieve C grade\n");
        }
        else if (score>=33 && score<41){
            System.out.println("You achieve D grade\n");
        }
        else if (score>=0 && score<=32){
            System.out.println("You Fail");
        }
        else{
            System.out.println("Please enter your marks again\n");
        }
       
    }
       sc.close();
    }
}
