

public class DemonetisationException extends Exception {
    float amount;
    DemonetisationException(float amount){
        this.amount = amount;
    }
    @Override
    public String toString() {
        String statement = new String("Deposit of Old Currency of Rs:" + this.amount + " crosses Rs:5000.00 and cannot be Deposited.");
        return statement;
    }
}
