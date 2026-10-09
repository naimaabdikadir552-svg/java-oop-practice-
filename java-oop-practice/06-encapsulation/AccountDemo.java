class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        System.out.println("Balance = " + account.getBalance());

        account.withdraw(100);
        System.out.println("Balance after withdrawal = " + account.getBalance());

        account.withdraw(1000);
    }
}