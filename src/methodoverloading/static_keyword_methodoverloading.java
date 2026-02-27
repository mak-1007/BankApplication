package methodoverloading;

class Add{
public static int add(int a, int b){
    return  a+b;
}

public static int add(int a, int b, int c){
    return a+b+c;
}

public static double add(double a, double b){
    return a+b;

}

public static double add(double a, double b, double c){
    return a+b+c;

}
        }

public class static_keyword_methodoverloading{
    public static void main (String args[]){
        Add obj=new Add();
        System.out.println(obj.add(2,5));
    }
}
