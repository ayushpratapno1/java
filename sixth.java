import java.util.*;
public class sixth {
    public static void main(String[] args) {
       // Print the area of a circle
       Scanner cir = new Scanner(System.in);
       // Taking the radius from user
       System.out.println("Enter the radius of the circle:");
       float radius = cir.nextFloat();
       float pie = 3.14f;
       // calculation the results
       float area = pie*radius*radius;
         // Print the area
         System.out.println("The area of the circle is: " + area);
         System.out.println("Area: " + ((radius*radius)*pie));
         // Closing the scanner
         cir.close();
    }
    
}
