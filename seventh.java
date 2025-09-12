import java.util.Scanner;
public class seventh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Type conversion example
        // byte->short->int->long->float->double
        // Here we are converting int to float
        byte num = 100;
        int num1 =  num;
        System.out.println(num1);
        // Now we convert data type by taking user input
        System.out.println("Enter an int value: ");
        // Here we converting int to float and then convert it to double
        float num3 = sc.nextInt();
        double d = num3;
        System.out.println("Converted value:" + d);
        long l = sc.nextLong();
        double num4 = l;
        System.out.println(num4);
        // Close the scanner
        sc.close();
    }
}