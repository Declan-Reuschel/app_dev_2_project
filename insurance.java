public abstract class Insurance implements deductible {
  //policy holder name 
  private String policyholderName;
  //unique policy number 
  private int policyNumber;
  // total number of policies created so far , initialized to 0
  private static int totalPolicies = 0;
  // premium amount, initialized to 0 
  private double premiumAmount = 0;

