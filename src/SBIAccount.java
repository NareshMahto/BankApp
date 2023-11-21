import java.util.UUID;

public class SBIAccount implements BankInterface{

    // account details fields
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private Double rateOfInterest;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    // constructor
    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    // implemented methods from implementations
    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "your amount is = " + amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {

        if (enteredPassword.equals(this.password)) {
            if (balance < amount) {
                return "low balance";
            } else {
                balance -= amount;
                return "money deducted";
            }
        } else {
            return "wrong password";
        }

    }

    @Override
    public double calculateInterest(int time) {
        return (balance * rateOfInterest * time) / 100.0;
    }
}
