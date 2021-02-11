package Chapter3;

public class Account {
    private String accountName;
    private double balance;
    private int pin;

    public Account(String accountName, int pin) {
        this.accountName = accountName;
        this.balance = 0.0;
        this.pin = pin;

    }


    public static void main(String[] args) {

    }

    public void setName(String accountName) {

        this.accountName = accountName;
    }


    public String getName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
        }else{
            System.out.print("withdrawal amount exceeded account balance");

        }
    }

    public void changePin(int newPin, int oldPin) {
        if(pin ==oldPin){
            pin = newPin;
        } else{
            System.out.println("pin already exists");
        }
    }
}
