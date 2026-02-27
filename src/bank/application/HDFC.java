package bank.application;

import java.util.UUID;

public class HDFC implements BankInterface{
    private int balance;
    private String password;
    private String accNO;
    private String accHolderName;
    private int rateOfIntrest;

    HDFC(int balance,String password, String accNO){
        this.accHolderName=accHolderName;
        this.password=password;
        this.accNO = UUID.randomUUID().toString();
        this.balance=balance;
    }

    @Override
    public int checkBalance(String password) {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        if (money<0) {
            System.out.println("enter the correct amount" );
        }
        else {
            System.out.println("you money added succesfully");
            balance = balance + money;
            System.out.println("total amount : "+balance);
        }

        return "";

    }
    @Override
    public String withDrawMoney(int amount, String passwords) {
        if(this.password.equals(password)){
            if(amount>balance) {
                System.out.println("insufficient balance");
            }
            else {
                balance -=amount;
                System.out.println(amount+ " : rupees debited succesfully");
                System.out.println("your total balance : "+balance);
            }
        }
        return "";
    }

    @Override
    public int changePassword(String old_password, String new_password) {
        return 0;
    }

    @Override
    public double calculateIntrest(int years, String password) {
        return 0;
    }
}
