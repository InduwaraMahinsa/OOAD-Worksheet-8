
public class BankDemo {
    public static void main(String[] args) {
        Account sharedAccount = new Account(12345, 15000);
       sharedAccount.displayBalance();     //for check account balance
        Thread user1 = new Thread(new BankTask(sharedAccount));
        Thread user2 = new Thread(new BankTask(sharedAccount));
        Thread user3 = new Thread(new BankTask(sharedAccount));

        user1.start();
        user2.start();
        user3.start();

        //for check account balance
        try {
            Thread.sleep(3000);
             sharedAccount.displayBalance();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}