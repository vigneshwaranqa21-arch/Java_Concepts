package Day5OOPS;

class BankAccount {

    // Attributes
    String accountHolder;
    double balance;

    // Constructor to initialize account
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
        System.out.println("Account created for " + accountHolder);
        System.out.println("Initial Balance: ₹" + balance);
    }

    // Deposit Method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Display account details
    void display() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankSimulation {

    public static void main(String[] args) {
        // Create a bank account object
        BankAccount acc1 = new BankAccount("Vigneshwaran", 5000);

        // Perform operations
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.withdraw(7000);  // to show insufficient balance
        acc1.display();
    }
}
