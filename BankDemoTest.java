import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double depositAmount = in.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(depositAmount, "123456");
        try {
            System.out.println("Please enter your withdrawal amount: ");
            double amount = in.nextDouble();
            checkingAccount.withdraw(amount);
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance()); 
        } catch (InsufficientFundsException e) {
            double lackof = checkingAccount.getBalance() - e.getAmount();
            System.out.println("Sorry, but your account is short by: $ " + Math.abs(lackof));
        }
    }
}