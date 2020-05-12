
import java.util.Scanner;

public class Account {
    float balance;
    final float minBalance = 500f;

    Account(){
        this.balance = this.minBalance;
    }

    void deposit(float amount,String currencyType){
        try {
            if(amount>5000 && currencyType.equalsIgnoreCase("OLD")){
                throw new DemonetisationException(amount);
            }
            else{
                this.balance += amount;
                System.out.println("Amount of Rs:"+amount+" deposited successfully.");
                this.currBalance();
            }
        } catch (DemonetisationException e){
            System.out.println(e.toString());
        }

    }

    void withDraw(float amount){
        Scanner scanner = new Scanner(System.in);
        if(this.balance-amount<500){
            System.out.println("This withdraw will lead to balance going below 500 (minimum balance).\n Would you like to continue ? Y/N");
            if(scanner.nextLine().equalsIgnoreCase("Y")){
                this.balance -= amount;
                System.out.println("Amount of Rs:"+amount+" withdrawn successfully.");
                this.currBalance();
            }
            else {
                System.out.println("Withdrawal of Amount of Rs:"+amount+" cancelled .");
                this.currBalance();
                return;
            }
        }
        else {
            this.balance -=amount;
            System.out.println("Amount of Rs:"+amount+" withdrawn successfully.");
            this.currBalance();
        }

    }

    void currBalance(){
        System.out.println(" Current Balance is " + this.balance);
    }
}
