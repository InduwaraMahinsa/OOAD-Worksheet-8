import java.util.Random;

public class UserTask implements Runnable {
    private JointAccount jointAccount;
    Random random = new Random();

    public UserTask(JointAccount jointAccount) {
        this.jointAccount = jointAccount;
    }

    @Override
    public void run() {
        // Perform random transactions (deposits and withdrawals)
       try {
           Thread.sleep(1000);
           int randomAmount = random.nextInt(101);
           boolean isDeposit = random.nextBoolean();
           jointAccount.getBalance();
           if (isDeposit) {
               jointAccount.deposit(randomAmount);
           }else{
               try {
                   jointAccount.withdraw(randomAmount);
               }catch (InsufficientBalanceException e){
                   System.out.println(e.getMessage());
               }
           }
       }catch (InterruptedException e){
           System.out.println(e.getMessage());
       }


    }
}