package assignment_1;
import java.util.Scanner;

public class EncryptionTest {
    // main method
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Encryption encryptor = new Encryption();

        encryption_loop: while (true) {
            System.out.println("1 - Encrypt");
            System.out.println("2 - Decrypt");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    System.out.println("Enter the plain text message: ");
                    String plain_text_message = stdin.nextLine();
                    System.out.println();
                    System.out.println("Encrypted Msg: " + encryptor.encryptString(plain_text_message));
                    break encryption_loop;
                case "2":
                    System.out.println("Enter the encrypted message: ");
                    String encrypted_message = stdin.nextLine();
                    System.out.println("Decrypted Msg: " + encryptor.decryptString(encrypted_message));
                    break encryption_loop;
                case "3":
                    break encryption_loop;
                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        }
    }
}
