public class thirty_nine {
    public static void main(String[] args){
        // Creating star pattern using nested loop
        for(int line = 1; line<=5; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
