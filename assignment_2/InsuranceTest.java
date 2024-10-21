package assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {

    private static ArrayList<Insurance> insurancePolicies = new ArrayList<>();

    // main method
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        insurance_loop: while (true) {
            System.out.println("1 - Create Health Insurance Policy");
            System.out.println("2 - Create Term-Life Insurance Policy");
            System.out.println("3 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    System.out.println("Enter name of policy holder: ");
                    String par1PolicyHolderHealth = stdin.nextLine();
                    System.out.println("Enter deductible amount: ");
                    double par2DeductibleAmount= Double.parseDouble(stdin.nextLine());
                    System.out.println("Enter co-payment: ");
                    double par3Copay = Double.parseDouble(stdin.nextLine());
                    System.out.println("Enter total out-of-pocket amount: ");
                    double par4OutOfPocket = Double.parseDouble(stdin.nextLine());

                    Health health = new Health(par1PolicyHolderHealth, par2DeductibleAmount, par3Copay, par4OutOfPocket);
                    insurancePolicies.add(health);
                    break;
                case "2":
                    System.out.println("Enter name of policy holder: ");
                    String par1PolicyHolderTermlife = stdin.nextLine();
                    System.out.println("Enter name of beneficiary: ");
                    String par2Beneficiary = stdin.nextLine();
                    System.out.println("Enter number of years in term: ");
                    int par3Term = Integer.parseInt(stdin.nextLine());
                    System.out.println("Enter amount of payout: ");
                    double par4Payout = Double.parseDouble(stdin.nextLine());

                    TermLife termlife = new TermLife(par1PolicyHolderTermlife, par2Beneficiary, par3Term, par4Payout);
                    insurancePolicies.add(termlife);
                    break;
                case "3":
                    for (Insurance policy: insurancePolicies) {
                        System.out.println(policy.toString());
                        System.out.println();
                    }

                    break insurance_loop;
                default:
                    System.out.println("Error: Please enter valid input\n");
            }
        }
    }
}
