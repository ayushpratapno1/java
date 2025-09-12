public class fourtee {
    public static void main(String[] args){
        // Creating inverted star pattern using nested loop
        int n = 5;
        // Outer Loop
        for (int line = 1; line<=n; line++){
            // Inner Loop
            for (int star = 1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
