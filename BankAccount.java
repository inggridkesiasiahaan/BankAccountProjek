public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        System.out.println("Akun dibuat: " + this.accountNumber + " | Pemilik: " + this.ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit gagal: jumlah harus lebih dari 0");
        } else {
            balance += amount;
            System.out.println("Deposit berhasil: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw gagal: saldo tidak cukup");
        } else {
            balance -= amount;
            System.out.println("Withdraw berhasil: " + amount);
        }
    }
}