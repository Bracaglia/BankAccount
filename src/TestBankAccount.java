public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bs = new BankAccount();
        bs.deposit(100, "checking");
        bs.checkBalances();
        bs.withdraw(50, "checking");
        bs.checkBalances();
        double seeBalance = bs.getCheckingBalance();
        System.out.println(seeBalance);
        double seeBalanceSave = bs.getSavingsBalance();
        System.out.println(seeBalanceSave);
        bs.provideNumber();
    }

}
