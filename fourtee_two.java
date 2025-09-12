public class fourtee_two {
    public static void main(String[] args){
        // Pyramid using updated Characters
        char ch = 'A';
        for (int line = 1; line<=5; line++){
            for (int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
