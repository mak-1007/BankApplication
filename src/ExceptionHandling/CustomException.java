package ExceptionHandling;
import java.util.Scanner;

public  class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
    public void Tsunami() throws CustomException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the water lvl ");
        int lvl=sc.nextInt();
        if(lvl>1000){
            throw new CustomException("Tsunami has come! Run away!");
        }
    }
    public static void main(String args[]){
        CustomException obj=new CustomException("check");
        try
        {
            obj.Tsunami();
        }
        catch (CustomException e){
            System.out.println(" the water level us high "+e.getMessage());

        }
        System.out.println("everything is okay");
    }

}