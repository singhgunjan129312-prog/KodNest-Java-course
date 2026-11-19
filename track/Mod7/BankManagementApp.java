import java.util.Scanner;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}


class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        balance += amount;
        System.out.println("Deposit Successful");
    }

  
    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful");
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            String name = scanner.nextLine();
            int accNo = Integer.parseInt(scanner.nextLine());
            double initialBalance = Double.parseDouble(scanner.nextLine());

           
            BankAccount account = new BankAccount(name, accNo, initialBalance);

            double depositAmount = Double.parseDouble(scanner.nextLine());
            try {
                account.deposit(depositAmount);
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }

            double withdrawAmount = Double.parseDouble(scanner.nextLine());
            try {
                account.withdraw(withdrawAmount);
            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } finally {
                account.checkBalance();
                System.out.println("Transaction Completed");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}