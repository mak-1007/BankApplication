package methodoverloading;

import java.util.Scanner;

class product{

    public int mul(int a, int b){
        return  a*b;
    }

    public int mul(int a, int b, int c){
        return a*b*c;
    }

    public double mul(double a, double b){
        return a*b;

    }

    public double mul(double a, double b, double c){
        return a*b*c;

    }

}


public class multiply {
    public static void main(String args[]){

    product p = new product();
        System.out.println(p.mul(10,3));
        System.out.println(p.mul(2,4,6));
        System.out.println(p.mul(3.2, 3.6));
        System.out.println(p.mul(3.2,4.2,7.5));

    }
}

