import java.util.Objects;
import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int NUM_OF_ACCOUNTS;
    private static int TOTAL_DEPOSITS;

    private static  int ACCOUNT_NUMBER;

    BankAccount(){
        NUM_OF_ACCOUNTS++; //ALL CAPS DUE TO BEING STATIC VARIABLE
    }

    public void deposit(double amount, String accountType){
        if(Objects.equals(accountType, "checking")){
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }
        TOTAL_DEPOSITS += amount;
    }

    public void withdraw(double amount, String accountType){
        if(accountType == "checking" && checkingBalance >= amount){
            checkingBalance -= amount;
        } else if(savingsBalance >= amount){
            savingsBalance -= amount;
        }
        TOTAL_DEPOSITS -= amount;
    }
    // CODE -> GENERATE -> SELECT; THAT'S HOW YOU GENERATE GETTERS

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void checkBalances() {
        System.out.println(checkingBalance + savingsBalance);
    }

    private int randomAccountNumber(){
        Random accountNumber = new Random();
        System.out.println(Math.abs(accountNumber.nextInt(100)));
        return accountNumber.nextInt();
    }
    public int provideNumber(){
        return randomAccountNumber();
    }
}
