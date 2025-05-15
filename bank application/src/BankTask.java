import java.util.Random;

public class BankTask implements Runnable{
       Account  account;
       Random rand = new Random();

       BankTask(Account account){
           this.account = account;
       }
        @Override
       public void run(){

               try {
                   Thread.sleep(1000);
                   int randomStep = rand.nextInt(101);
                   double randomAmount = randomStep *100;
                   boolean isDeposit = rand.nextBoolean();

                   if(isDeposit){
                       account.deposit(randomAmount);
                       System.out.println("Deposited "+randomAmount);
                   }else{
                       try {
                           account.withdraw(randomAmount);
                       }catch (InsufficientBalanceException e){
                           System.out.println(e.getMessage());
                       }
                   }

               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }


       }
}
