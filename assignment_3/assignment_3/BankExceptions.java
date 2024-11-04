package assignment_3;
//four exception classes 
//invalid password exception
class InvalidPasswordFormatException extends Exception {
    public InvalidPasswordFormatException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }
}
//negative dollar amount exception 
class NegativeDollarAmountException extends Exception {
    public NegativeDollarAmountException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }
}
//insufficient funds exception 
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }
}

class CustomerAccountNotFoundException extends Exception {
    //customer account not found exception 
    public CustomerAccountNotFoundException(String par1ErrorMessage) {
        super(par1ErrorMessage);
    }
}
