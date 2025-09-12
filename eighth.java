import java.util.Scanner;
public class eighth {
    public static void main(String[] args) {
        // Narrowing conversion example
        Scanner sc = new Scanner(System.in);
        // double->float->long->int->short->byte
        float d = 10.999f;
        byte a = (byte) d; // Explicit narrowing conversion
        // Print the results
        System.out.println(a);
        // This will remove the part after the '.' and only keep the integer part.
        // Now here we convert the data type by taking input from user
        System.out.println("Enter a value:");
        double value = sc.nextDouble();
        int intvalue = (int) value; // Explicit narrowing conversion
        System.out.println("Narrowed int value: " + intvalue);
        // Close the scanner
        sc.close();    
    }

}
