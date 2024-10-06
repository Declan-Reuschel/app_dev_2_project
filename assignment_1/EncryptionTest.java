package assignment_1;
import java.util.Scanner;

public class EncryptionTest {
    public static void Encryption() {
        System.out.println("1 - Encrypt%\n");
        System.out.println("2 - Decrypt%\n");
        System.out.println("3 - Exit");
    }

    // main method; add test function calls here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Encryption();
        System.out.println("Please enter choice: ");
    }
}
