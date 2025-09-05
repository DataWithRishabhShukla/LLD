package DesignPatterns.Adapter;

public class YesBankAdapter implements BankAPI{
    private YesBank yesBank;

    @Override
    public void addBankAccount(Bank bank) {

    }

    @Override
    public boolean pay(double amount, String account) {
        return false;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void transferFunds(String srcAccount, String destAccount, double amount) {

    }
}
