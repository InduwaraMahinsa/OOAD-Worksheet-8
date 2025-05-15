public class Account {

    final int accountNumber;
    private double balance;

    //constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to get account number
    public synchronized int getAccountNumber() {
        return accountNumber;
    }

    //method to display available balance
    public synchronized void displayBalance(){
        System.out.println("Account Balance : "+balance);
    }


    //method to deposit
    public synchronized void deposit(double amount){
        this.balance += amount;
    }

    //method to withdraw
    public synchronized void withdraw(double amount) throws InsufficientBalanceException{
        if(amount >= balance){
            throw new InsufficientBalanceException(amount,balance);
        }else{
            this.balance -= amount;
            System.out.println("Successfully withdrawn  "+amount);
        }
    }
}
