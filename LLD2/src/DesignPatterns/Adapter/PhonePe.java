package DesignPatterns.Adapter;

public class PhonePe {

    private  BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    void performBankOperation(){
        Bank bank = new Bank("1232","Rishabh");

        bankAPI.addBankAccount(bank);
        boolean paymentStatus = bankAPI.pay(100,"12322323");

        if(paymentStatus){
            bankAPI.transferFunds("1232323","121323442",50);
        }

    }
}
