package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {

    public static ArrayList insurancePolicies = new ArrayList();

    // main method
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        encryption_loop: while (true) {
            System.out.println("1 - Create Health Insurance Policy");
            System.out.println("2 - Create Term-Life Insurance Policy");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    break encryption_loop;
                case "2":
                    break encryption_loop;
                case "3":
                    break encryption_loop;
                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        }

        stdin.close();
    }

}
