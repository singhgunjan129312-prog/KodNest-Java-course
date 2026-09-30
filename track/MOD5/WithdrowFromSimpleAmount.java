import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        // Store opening balance
            this.balance = balance;
    }

    public void withdraw(double amount) {
        // Perform a valid withdrawal
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class WithdrowFromSimpleAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ba = sc.nextDouble();
        double am = sc.nextDouble();
        BankAccount b = new BankAccount(ba);
        b.withdraw(am);
        double val = b.getBalance();
        System.out.println(val);

        // Complete the program
    }
}