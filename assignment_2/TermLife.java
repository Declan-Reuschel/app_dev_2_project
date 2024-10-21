package assignment_2;

public class TermLife extends Insurance {



    private String beneficiaryName;



    private int policyTerm;
    private double termPayout;

    public TermLife(String par1PolicyHolder, String par2Beneficiary, int par3Term, double par4Payout) {

        super(par1PolicyHolder);

        this.beneficiaryName = par2Beneficiary;
        this.policyTerm = par3Term;
        this.termPayout = par4Payout;

    }

    @Override
    public double calculatePremium() {
        return (this.termPayout / (12 * this.policyTerm));
    }

    @Override
    public String toString() {
        return "Policyholder: " + this.getPolicyHolderName() + "\nPolicy Number: " + this.getPolicyNumber() + "\nPremium: " + String.format("%.2f", this.calculatePremium());
    }

    // define getters and setters

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public double getTermPayout() {
        return termPayout;
    }

    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }


}

