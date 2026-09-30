import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Add only a positive amount
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class DepositeInBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = sc.nextDouble();
        double amo = sc.nextDouble();
        BankAccount b = new BankAccount(bal);
        b.deposit(amo);
        double ans = b.getBalance();
        System.out.println(ans);

    }
}