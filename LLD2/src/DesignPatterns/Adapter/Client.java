package DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {

        System.out.println("Hello from Adapter and Facade pattern example!");
        BankAPI bankAPI = new YesBankAdapter();
        PhonePe phonePe = new PhonePe(bankAPI);

    }
    
}
