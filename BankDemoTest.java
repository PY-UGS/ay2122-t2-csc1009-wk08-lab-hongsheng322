import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double depositAmount = in.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(1000, "123456");
        checkingAccount.deposit(depositAmount);

        try {
            System.out.println("Please enter your withdrawal amount: ");
            double amount = in.nextDouble();
            checkingAccount.withdraw(amount);
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance()); 
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $ " + (checkingAccount.getBalance() - e.getAmount()));
        }
    }
}