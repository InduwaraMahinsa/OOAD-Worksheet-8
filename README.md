# OOAD-Worksheet-8

Lab Exercise on Threads and Exception Handling (2024)
Course Information
Year: 2
Subject: SE2012 – Object-Oriented Analysis and Design
Semester: 1

Objectives
Understand the basics of Threading and Exception Handling in Java.
Write programs that use Exception Handling and Threads from scratch.
Exercise 1: Bank Application with Custom Exceptions
Description
In this exercise, you will create a simple banking application where a customer can deposit and withdraw money from their account. You will introduce custom exceptions to handle errors such as insufficient funds.

Tasks
Create a class InsufficientBalanceException:
This exception should be thrown when a withdrawal exceeds the available balance.
The exception should accept the withdrawal amount as a parameter and display an appropriate error message.
Create an Account class:
This class should store the account number and balance.
Implement the following methods:
displayBalance(): Displays the current balance.
deposit(double amount): Adds the given amount to the balance.
withdraw(double amount): Deducts the specified amount from the balance, but if the balance is insufficient, it throws the InsufficientBalanceException.
Write a BankDemo main program:
In the main method, create an Account object and test depositing and withdrawing money.
Use a try-catch block to handle the InsufficientBalanceException and display a user-friendly message when it occurs.
Sample Output
Account Number: 12345
Initial Balance: $1000
Enter withdrawal amount: $1200
Error: Insufficient balance. You tried to withdraw $1200, but only $1000 is available.
    
Exercise 2: Extending Bank Application with Loops and Finally Block
Description
Modify the bank application from Exercise 1 to handle repeated transactions until the user decides to stop.

Tasks
Continuous Withdrawal and Deposit Loop:
The program should continuously prompt the user for a withdrawal amount. If the balance is insufficient, throw the InsufficientBalanceException.
After each transaction, ask the user: "Do you wish to continue?" If they respond "no," terminate the program.
Use a finally block:
After each transaction, regardless of success or failure, print a message asking if the user wants to continue. Ensure this happens inside a finally block.
Additional Requirements:
If the user says "yes," automatically deposit the withdrawn amount back into the account and continue the withdrawal process.
Follow good OOP practices to avoid code duplication.
Exercise 3: Multithreading with Bank Accounts
Description
Extend the Bank Application to use Threads to simulate multiple users accessing their accounts simultaneously.

Tasks
Create a BankTask class:
Implement the Runnable interface.
This class should represent an individual task that can either deposit or withdraw a random amount from the account.
Run Multiple Threads:
In the BankDemo class, create multiple threads (e.g., 3) that simulate different users accessing the bank account concurrently.
Use the start() method to run the threads.
Handle Thread Safety:
Since multiple threads will be accessing the shared Account object, ensure thread safety using synchronization.
Exercise 4: Joint Account with Multiple Users
Description
In this exercise, you will simulate a joint bank account accessed by three different users (threads). Each user will perform random deposits and withdrawals, and the program should handle these operations concurrently using threads and synchronization.

Tasks
Create a JointAccount class:
This class will represent a shared bank account accessed by multiple users.
Define a private balance variable to store the account's balance.
Implement methods for depositing, withdrawing, and retrieving the balance.
Use synchronization to ensure thread safety.
// Class structure for JointAccount
public class JointAccount {
    private double balance;

    public JointAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Add synchronized methods for deposit, withdraw, and getBalance
}
        
Create an InsufficientBalanceException class:
This custom exception will be thrown if a user tries to withdraw more money than is available in the account.
// Create a simple custom exception
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double amount) {
        super("Insufficient balance for withdrawal of: $" + amount);
    }
}
        
Implement the UserTask class:
This class represents a user interacting with the joint account.
It should randomly decide whether the user deposits or withdraws money, using a random amount between $0 and $100.
Handle exceptions appropriately when withdrawals exceed the available balance.
// UserTask structure
public class UserTask implements Runnable {
    private JointAccount jointAccount;

    public UserTask(JointAccount jointAccount) {
        this.jointAccount = jointAccount;
    }

    @Override
    public void run() {
        // Perform random transactions (deposits and withdrawals)
    }
}
        
Create the main program JointAccountDemo:
Initialize the joint account with an initial balance of $1000.
Create and start three threads, each representing a user interacting with the joint account.
Wait for all threads to complete and then print the final balance.
// Structure for the main program
public class JointAccountDemo {
    public static void main(String[] args) {
        // Initialize the joint account and create three user threads
    }
}
        
Submission Guidelines
Write all code from scratch.
Ensure your programs are well-documented with appropriate comments.
Test your programs thoroughly and submit them along with your test cases.
Good luck, and have fun coding!
