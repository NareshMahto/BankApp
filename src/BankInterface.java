public interface BankInterface {

    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount, String enteredPassword);
    double calculateInterest(int time);

}
