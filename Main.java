public class Main {
    public static void main(String[] args) {

    BankAccount akun = new
BankAccount("533117", "Inggrid");
    akun.deposit(300000);
    akun.deposit(-20000);
    akun.withdraw(500000);
    System.out.println("Saldo akhir:" + akun.getBalance());
  }
}
