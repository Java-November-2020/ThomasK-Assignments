public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();

        String acc = "Checking";
        String svg = "Savings";

        bankAcc.BankAccount();
        bankAcc.depositMoney(acc, 500);
        bankAcc.depositMoney(svg, 300);
        bankAcc.getCheckingAccountBalance();
        bankAcc.getSavingAccountBalance();
        bankAcc.withdrawMoney(acc, 100);
        bankAcc.withdrawMoney(svg, 20);
        bankAcc.getCheckingAccountBalance();
        bankAcc.totalMoney();

    }
}