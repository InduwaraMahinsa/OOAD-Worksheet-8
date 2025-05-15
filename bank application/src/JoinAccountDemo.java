public class JoinAccountDemo {
    public static void main(String[] args) {
        JointAccount joinAccount = new JointAccount(1000);

        Thread user1 = new Thread(new UserTask(joinAccount) );
        Thread user2 = new Thread(new UserTask(joinAccount) );
        Thread user3 = new Thread(new UserTask(joinAccount) );

        user1.start();
        user2.start();
        user3.start();
    }
}
