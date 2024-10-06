package assignment_1;
import java.util.Scanner;

public class EncryptionTest {
    // main method; add test function calls here
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        encryption_loop: while (true) {
            System.out.println("1 - Encrypt");
            System.out.println("2 - Decrypt");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    System.out.println("hit 1");
                    break;
                case "2":
                    System.out.println("hit 2");
                    break;
                case "3":
                    break encryption_loop;
                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        }
    }
}
