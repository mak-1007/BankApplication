package bank.application;

import java.util.UUID;

public class SBI implements BankInterface {
    private int balance;
    private String accNo ;
    private String password;
    private String AccHolderName;
    public static double rateOfIntrest;
// contructor to initialize the calues
    SBI(int balance, String password,String AccHolderName){
        this.accNo= UUID.randomUUID().toString();
        this.AccHolderName=AccHolderName;
        this.balance=balance;
        this.password=password;
    }
//implementation
    @Override
    public int checkBalance(String password) {
        if(password == this.password){
            return balance;
        }
        return -1;

    }

    @Override
    public String addMoney(int money) {
        if (money<0) {
            System.out.println("enter the correct amount" );
        }
        else {
            System.out.println("you money added succesfully");
            balance = balance + money;
            System.out.println(" now total amount : "+balance);
        }
        return "";
    }

    @Override
    public int changePassword(String old_password, String new_password) {
        if ( this.password == old_password){
            this.password=new_password;
            System.out.println("your passsword succesfully changed");
        }
        else {
            System.out.println("enter the correct password");
        }
        return 0;
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
    public   double calculateIntrest(int years, String password) {
        double intrest = balance*rateOfIntrest*years/100;

        return intrest;
    }






}
