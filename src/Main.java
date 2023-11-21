import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Please enter name, password and balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

       // SBIAccount nareshAcc = new SBIAccount(name, balance, password);
        HDFCAccount nareshAcc = new HDFCAccount(name, balance, password);
        System.out.println("Your account has been created with account number: " + nareshAcc.getAccountNo());

        //get balance
        System.out.println("Your current balance is: " + nareshAcc.getBalance());

        //deposit
        System.out.println(nareshAcc.depositMoney(500));
        System.out.println("Your new balance is: " + nareshAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to bve withdrawn");
        int amount  = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();


        System.out.println(nareshAcc.withdraw(amount, enteredPassword));
        System.out.println("Your new current balance is: " + nareshAcc.getBalance());

        //interest
        System.out.println("Interest on current balance: " + nareshAcc.getBalance() + " is " + nareshAcc.calculateInterest(4));



    }
}