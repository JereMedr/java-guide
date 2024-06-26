public class Main {
    public static void main(String[] args) {
        // Creating an Account object
        Account myAccount = new Account("123456789", 1000.00);

        // Accessing account details through public methods
        System.out.println("Account Number: " + myAccount.getAccountNumber()); // Output: Account Number: 123456789
        System.out.println("Initial Balance: $" + myAccount.getBalance()); // Output: Initial Balance: $1000.0

        // Depositing money
        myAccount.deposit(500.00);
        System.out.println("Balance after deposit: $" + myAccount.getBalance()); // Output: Balance after deposit: $1500.0

        // Withdrawing money
        myAccount.withdraw(200.00);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance()); // Output: Balance after withdrawal: $1300.0

        // Attempting to withdraw more than the balance
        myAccount.withdraw(2000.00); // Output: Invalid or insufficient funds for withdrawal
        System.out.println("Final Balance: $" + myAccount.getBalance()); // Output: Final Balance: $1300.0
    }
}
