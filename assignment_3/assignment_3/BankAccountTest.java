package assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTest {

    static Scanner stdin = new Scanner(System.in);

    private static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    // process main menu, main method
    public static void main(String[] args) {
        banking_loop: while (true) {
            System.out.println("1 - Create An Account");
            System.out.println("2 - Delete An Account");
            System.out.println("3 - Make An Account Deposit");
            System.out.println("4 - Make An Account Withdrawal");
            System.out.println("5 - Check An Account Balance");
            System.out.println("6 - Exit");
            System.out.println();
            System.out.println("Enter choice: ");
            String user_response = stdin.nextLine();

            switch(user_response) {
                case "1":
                    //create a new checkung account
                    System.out.println("Enter Customer Name: ");
                    String n_customer_name = stdin.nextLine();
                    System.out.println("Enter User ID: ");
                    String n_user_id= stdin.nextLine();

                    // NEEDS PASSWORD VALIDATION ADDED; EXCEPTION CLASS CREATED, BUT MUST BE THROWN AND HANDLED

                    System.out.println("Enter User Password: ");
                    String n_user_password = stdin.nextLine();

                    try {
                        String password_val = checkPassword(n_user_password);
                        if (password_val.length() < 8 || !password_val.contains("*")) throw new InvalidPasswordFormatException("Error: Must Enter a Valid Password\nInvalidPasswordFormatException: Invalid Password Format");
                    } catch(InvalidPasswordFormatException invalidException) {
                        System.err.println(invalidException.getMessage());
                        break;
                    }

                    Checking n_account = new Checking(n_customer_name, n_user_id, n_user_password);
                    bankAccounts.add(n_account);

                    System.out.println();

                    break;
                case "2":
                    // delete a checking account 
                    System.out.println("Enter user ID: ");
                    String d_user_id= stdin.nextLine();
                    System.out.println("Enter password");
                    String d_user_password = stdin.nextLine();

                    try {
                        int d_account_index = searchUserAccount(d_user_id, d_user_password);

                        if (d_account_index == -1) {
                            throw new CustomerAccountNotFoundException("Error: Must Enter a Valid User ID and Password\nCustomerAccountNotFoundException: Customer Account Not Found");
                        }

                        bankAccounts.remove(d_account_index);

                        BankAccount.decrementAccounts();

                        System.out.println();
                    } catch(CustomerAccountNotFoundException notFoundException) {
                        System.err.println(notFoundException.getMessage());
                        break;
                    }

                    break;
                case "3":
                    //make a deposit 
                    BankAccount a_account = promptForUserAccount();
                    if (a_account == null) break; // the exception handling itself is handled in promptForUserAccount

                    System.out.println("Enter Amount: ");
                    double a_deposit_amount= Double.parseDouble(stdin.nextLine());
                    try {
                        if (a_deposit_amount < 0){
                            throw new NegativeDollarAmountException("Error: Must Enter a Positive Dollar Amount\nNegativeDollarAmountException: Negative Dollar Amount");
                        }
                    } catch (NegativeDollarAmountException negativeException) {
                        System.err.println(negativeException.getMessage());
                        break;
                    }

                    a_account.depositAmount(a_deposit_amount);

                    break;
                case "4":
                    //make a withdrawl 
                    BankAccount w_account = promptForUserAccount();
                    if (w_account == null) break; // the exception handling itself is handled in promptForUserAccount

                    System.out.println("Enter Amount: ");
                    double w_withdrawal_amount = Double.parseDouble(stdin.nextLine());

                    try {
                        if (w_withdrawal_amount < 0) {
                            throw new NegativeDollarAmountException("Error: Must Enter a Positive Dollar Amount\nNegativeDollarAmountException: Negative Dollar Amount");
                        } else if (w_withdrawal_amount > w_account.getAccountBalance()) {
                            throw new InsufficientFundsException("Error: Must WIthdrawal an Amount Less Than Your Balance\nInsufficientFundsException: Insufficient Funds");
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                        break;
                    }

                    w_account.withdrawAmount(w_withdrawal_amount);

                    System.out.println();

                    break;
                case "5":
                    //check account balance 
                    BankAccount p_account = promptForUserAccount();
                    if (p_account == null) break; // the exception handling itself is handled in promptForUserAccount

                    System.out.println("Customer Name: " + p_account.getCustomerFullName());
                    System.out.println("Account Number: " + Integer.toString(p_account.getAccountID()));
                    System.out.println("Account Balance: " + String.format("%.2f",(p_account.getAccountBalance())));

                    if (p_account instanceof Checking) {
                        System.out.println("Account Type: Checking");
                        System.out.println("Account Daily Withdrawal Limit: " + String.format("%.2f",((Checking) p_account).getDailyWithdrawalLimit()));
                    }

                    System.out.println();

                    break;
                    //terminate program 
                case "6":
                    System.out.println("Exiting program. Have a nice day!");
                    break banking_loop;
                default:
                    System.out.println("Error: Please enter a valid choice (1 thru 6)\n");
            }
        }
    }

    //temporary shim to get this to compile
    public static String checkPassword(String password) {
        return password;
    }


    public static BankAccount promptForUserAccount() {
        try {
            System.out.println("Enter user ID: ");
            String g_user_id = stdin.nextLine();
            System.out.println("Enter password");
            String g_user_password = stdin.nextLine();

            int g_account_index = searchUserAccount(g_user_id, g_user_password);

            if (g_account_index == -1) throw new CustomerAccountNotFoundException("Account not found\n");

            return bankAccounts.get(g_account_index);
        } catch(CustomerAccountNotFoundException notFoundException) {
            System.err.println(notFoundException.getMessage());
            return null;
        }
    }

    // returns -1 if not found; returns the index of the account in the arraylist if found
    public static int searchUserAccount(String par1UserID, String par2UserPassword) {
        int account_index = -1;

        for (int i = 0; i < bankAccounts.size(); i++) {
            BankAccount s_account = bankAccounts.get(i);

            if (s_account.getUserID().equals(par1UserID) && s_account.getUserPassword().equals(par2UserPassword)) {
                account_index = i;

                break;
            }
        }

        return account_index;
    }
}
