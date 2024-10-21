package assignment_2;

public abstract class Insurance {

    private static int numberOfPolicies = 0;

    private String policyHolderName;
    private  int policyNumber;
    private double premiumAmount = 0;


    public Insurance(String par1String) {

        this.policyHolderName = par1String;
        this.policyNumber = getNumberOfPolicies();
        setNumberOfPolicies(getNumberOfPolicies() + 1);
    }

    public abstract double calculatePremium();

    private int getNumberOfPolicies() {
        return numberOfPolicies;
    }

    private void setNumberOfPolicies(int par1Int) {
        numberOfPolicies = par1Int;
    }
@Override
    public String toString() {
        return "Policy Holder Name: " + this.getPolicyHolderName() + "\nPolicy Number: " + Integer.toString(this.getPolicyNumber()) + "\nPremium Amount:" + String.format("%.2f", this.getPremiumAmount());
    }

    // define getters and setters

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }


}
