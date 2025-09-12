public class tenth {
    public static void main(String[] args) {
        // Compute the type promotion in expression
        // compute the a+b-c*d
        int a = 5;
        byte b = 10;
        float c = 10.5f;
        double d = 3.14;
        // Type promotion occurs here
        double result = a+b-c*d;
        System.out.println("Result using variable:" + result);
        System.out.println("Direct calculation Result:" + (a+b-c*d));
        
        }
}