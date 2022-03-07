public class CheckingAccount {
    private double balance;
    private String accountNumber;

    public CheckingAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getNumber(){
        return this.accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > getBalance()) {
            throw new InsufficientFundsException(amount);
        }
        else {
            balance -= amount;
        }

    }

}