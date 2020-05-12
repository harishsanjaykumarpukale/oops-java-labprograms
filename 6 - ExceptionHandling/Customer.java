
import java.util.Scanner;

public class Customer {
    public static void main(String  args[]){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        while (true){
            System.out.println("\n Press \n 1 for Balance Enquiry \n 2 for Deposit \n 3 for Withdrawal \n 4 for Exit \n:");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    account.currBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount and currency Type (OLD / NEW)");
                    account.deposit((float) Integer.parseInt(scanner.nextLine()),scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Enter the amount");
                    account.withDraw((float) Integer.parseInt(scanner.nextLine()));
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
