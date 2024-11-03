package assignment_3;

public class BankAccount {
//string, private customer name 
    private String customerFullName;
    //int, private, unique account id 
    private int accountID;
    //int, private, static number of accounts, initialized to 0
    private static int numberOfAccounts = 0;

    //string, private, user id
    private String userID;
    //string, private, login password
    private String userPassword;
    //double, private account balance 
    private double accountBalance;



    public BankAccount(String par1Name, String par2UserID, String par3UserPassword) {
//overloaded constructor 
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
//static method for number of accounts 
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
