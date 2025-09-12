import java.util.*;
public class fourth {

    public static void main(String[] args){
        // Print Full sentence
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        // This line only print first word
        String sentence1 = input.next();
        // This line print full sentence
        String sentence2 = input.nextLine();
        // Print the sentence
        System.out.println(sentence1);
        System.out.println(sentence2);
        // Closing the scanner
        input.close();
    }
}