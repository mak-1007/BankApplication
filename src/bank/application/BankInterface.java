package bank.application;
//int password
public interface BankInterface {
    public int checkBalance(String password);

    public String  addMoney(int money);

    public String withDrawMoney( int amount,String passwords );

    public int changePassword(String old_password, String new_password);

    public double calculateIntrest(int years,String password);
}
