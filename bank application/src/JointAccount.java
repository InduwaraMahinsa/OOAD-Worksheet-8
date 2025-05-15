public class JointAccount {
    private double balance;

    public JointAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
           throw new InsufficientBalanceException(amount,balance);
        }else {
            this.balance -= amount;
            System.out.println("Successfully withdrawn  "+amount);
        }
    }

    public synchronized void deposit(double amount) {
         this.balance += amount;
         System.out.println("Successfully deposited "+amount);
    }

    public synchronized double getBalance() {
        return balance;
    }
}
