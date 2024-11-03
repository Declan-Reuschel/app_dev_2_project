package assignment_3;
//inherits bank account class
public class Checking extends BankAccount {


//double, private daily limit 
    private double dailyWithdrawalLimit;
//overloaded constructor 
    public Checking(String par1Name, String par2UserID, String par3UserPassword) {

        super(par1Name, par2UserID, par3UserPassword);

        this.dailyWithdrawalLimit = 300.00;

    }

    // getters/setters

    public double getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

}
