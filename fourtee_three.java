public class fourtee_three {
    // INVERTED & ROTATED HALF-PYRAMID pattern (ADVANCED PATTERN-1)
    public static void main(String args[]){
        int num = 4;
        for (int i = 1; i<=num; i++){
            for (int j = 1; j<=num-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
