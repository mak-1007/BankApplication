package bank.application;

import java.util.SplittableRandom;

public class Main {
    public static void main(String args[]){
        SBI accNO1 = new SBI (10000,"123","amaan");
        SBI accNO2 =new SBI(20000, "456","adnan");
        HDFC accNo3=new HDFC(30000,"789","anas");
        System.out.println("AccountNumber 1: SBI ");
        SBI.rateOfIntrest=7;

        int blanceChecheckinq_accNO1 =accNO1.checkBalance("123");
        System.out.println("your total balance is  "+blanceChecheckinq_accNO1);

        String accNO1_addMoney = accNO1.addMoney(3000);

        int accNO1_changepassword = accNO1.changePassword("123","321");

        String accNO1_withDrawMoney = accNO1.withDrawMoney(2000,"123");

        double accNO1_rateOfIntrest = accNO1.calculateIntrest(30,"123");
        System.out.println("your total rateOfIntrest : "+accNO1_rateOfIntrest);


//similalrly make accounts for HFC and call all the methods
        


    }
}
