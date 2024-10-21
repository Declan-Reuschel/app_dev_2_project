package assignment_2;

public class Health extends Insurance implements Deductible {

    private double deductibleAmount;
    private double deductiblePaid = 0;
    private double copayAmount;
    private double copayPaid = 0;

    private double outOfPocketAmount;

    public Health(String par1PolicyHolder, double par2Deductible, double par3Copay, double par4OutOfPocket) {

        super(par1PolicyHolder);

        this.deductibleAmount = par2Deductible;
        this.copayAmount = par3Copay;
        this.outOfPocketAmount = par4OutOfPocket;

    }

    @Override
    public double calculatePremium() {
        return this.deductibleAmount / 12;
    }

    @Override
    public boolean isDeductibleMet() {
        return (this.deductiblePaid >= this.deductibleAmount);
    }

    @Override
    public boolean isOutOfPocketMet() {
        return (this.deductiblePaid + this.copayPaid >= this.outOfPocketAmount);
    }

    @Override
    public String toString() {
        return "Policyholder: " + this.getPolicyHolderName() + "\nPolicy Number: " + this.getPolicyNumber() + "\nPremium: " + String.format("%.2f", this.getPremiumAmount())
                + "\nMet Deductible: " + this.isDeductibleMet() + "\nMet Total Out-Of-Pocket: " + this.isOutOfPocketMet();
    }

    // define getters and setters


    public double getDeductibleAmount() {
        return deductibleAmount;
    }

    public void setDeductibleAmount(double deductibleAmount) {
        this.deductibleAmount = deductibleAmount;
    }

    public double getDeductiblePaid() {
        return deductiblePaid;
    }

    public void setDeductiblePaid(double deductiblePaid) {
        this.deductiblePaid = deductiblePaid;
    }

    public double getCopayAmount() {
        return copayAmount;
    }

    public void setCopayAmount(double copayAmount) {
        this.copayAmount = copayAmount;
    }

    public double getCopayPaid() {
        return copayPaid;
    }

    public void setCopayPaid(double copayPaid) {
        this.copayPaid = copayPaid;
    }

    public double getOutOfPocketAmount() {
        return outOfPocketAmount;
    }

    public void setOutOfPocketAmount(double outOfPocketAmount) {
        this.outOfPocketAmount = outOfPocketAmount;
    }


}

