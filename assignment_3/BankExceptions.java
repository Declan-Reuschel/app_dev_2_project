package assignment_3;

 class InvalidPasswordFormatException extends Exception {

     public InvalidPasswordFormatException(String par1ErrorMessage) {
         super(par1ErrorMessage);
     }

}

class NegativeDollarAmountException extends Exception {


    public NegativeDollarAmountException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }

}

class InsufficientFundsException extends Exception {


    public InsufficientFundsException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }

}

class CustomerAccountNotFoundException extends Exception {


    public CustomerAccountNotFoundException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }

}
