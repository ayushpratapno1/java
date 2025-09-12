import java.util.*;
public class fifth {
    public static void main(String[] args) {
        // Taking different types of input and then print them
        Scanner input = new Scanner(System.in);
        // Taking inputs
        System.out.println("Enter an integer:");
        int integer = input.nextInt();
        System.out.println("Enter a double:");
        double decimal = input.nextDouble();
        System.out.println("Enter a string:");
        String text = input.next();
        System.out.println("Enter a character:");
        char character = input.next().charAt(0);
        // Printing the inputs
        System.out.println("Integer: " + integer);
        System.out.println("Double: " + decimal);
        System.out.println("String: " + text);
        System.out.println("Character: " + character);
        // closing the scanner
        input.close();    
    }
}