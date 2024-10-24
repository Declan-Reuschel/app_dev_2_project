package assignment_3;

public class BankAccount {

    private String customerFullName;
    private int accountID;
    private static int numberOfAccounts = 0;

    private String userID;
    private String userPassword;
    private double accountBalance;



    public BankAccount(String par1Name, String par2UserID, String par3UserPassword) {

        numberOfAccounts += 1;

        this.accountID = numberOfAccounts;
        this.customerFullName = par1Name;
        this.userID = par2UserID;
        this.userPassword = par3UserPassword;

        this.accountBalance = 0;

    }

    public void depositAmount(double par1Deposit) {
        this.accountBalance += par1Deposit;
    }

    public void withdrawAmount(double par1Deposit) {
        this.accountBalance -= par1Deposit;
    }

    // getters/static methods specific for account ID and number of accounts

    public int getAccountID() {
        return accountID;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void decrementAccounts() {
        numberOfAccounts -= 1;
    }

    // getters/setters

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


}
