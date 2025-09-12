import java.util.Scanner;
public class ninth {
    public static void main(String[] args) {
        // Converting char into int
        Scanner sc = new Scanner(System.in);
        // Taking a character input
        char ch = 'B';
        int i = ch;
        System.out.println(i);
        // Taking input from user
        System.out.println("Enter a character:");
        char userchar = sc.next().charAt(0);
        int userint = userchar;
        System.out.println("Converted value: " + userint);
        // Closing the scanner
        sc.close();
    }
    
}